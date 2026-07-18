<#

.SYNOPSIS
Autonomous CI healer - diagnoses and fixes GitHub Actions CI run failures for .NET.

.DESCRIPTION
Watches for failed CI runs, analyzes failure mode from GitHub Actions logs,
applies safe targeted fixes, commits and pushes a heal branch, and triggers
a workflow run until success or max attempts.

.PARAMETER Repo
Repository slug - owner/repo

.PARAMETER RunId
Workflow run ID to analyze

.PARAMETER WorkflowFile
CI workflow file dispatcher (default: "ci.yml")

.PARAMETER MaxAttempts
Maximum workflow retries (default 5)

.PARAMETER BaseBranch
PR base branch (default "main")

.PARAMETER DryRun
Print what would be done without writing changes

.EXAMPLE
.\ci-heal.ps1 -Repo owner/repo -RunId 12345

#>

[CmdletBinding()]
param(
    [Parameter(Mandatory=$true)]
    [string]$Repo,

    [Parameter(Mandatory=$true)]
    [long]$RunId,

    [Parameter(Mandatory=$false)]
    [string]$WorkflowFile = "ci.yml",

    [Parameter(Mandatory=$false)]
    [int]$MaxAttempts = 5,

    [Parameter(Mandatory=$false)]
    [string]$BaseBranch = "main",

    [Parameter(Mandatory=$false)]
    [switch]$DryRun
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

try {
    $progressPreference = 'SilentlyContinue'
} catch { }

# ---- Helpers ----
function Get-AuthHeader {
    $token = [System.Environment]::GetEnvironmentVariable('GITHUB_TOKEN', 'Process') ??
             [System.Environment]::GetEnvironmentVariable('GITHUB_TOKEN', 'User')
    if (-not $token) {
        throw "GITHUB_TOKEN environment variable is required."
    }
    return @{ Authorization = "Bearer $token" }
}

function Get-Json {
    param([string]$Uri)
    $response = Invoke-RestMethod -Uri $Uri -Headers $headers -Method Get
    return $response
}

function Invoke-GitHub {
    param(
        [string]$Uri,
        [string]$Method = 'Get',
        [object]$Body
    )
    $jsonBody = if ($null -ne $Body) { $Body | ConvertTo-Json -Depth 10 } else { $null }
    $params = @{
        Uri         = $Uri
        Method      = $Method
        Headers     = $headers
        ContentType = 'application/json'
    }
    if ($null -ne $jsonBody) { $params.Body = $jsonBody }
    Invoke-RestMethod @params
}

# ---- Initialization ----
$headers = Get-AuthHeader
$ciHealRoot = $PSScriptRoot

Write-Host ""
Write-Host "=== Autonomous CI Healer ==="
Write-Host "Repo        : $Repo"
Write-Host "RunId       : $RunId"
Write-Host "Workflow    : $WorkflowFile"
Write-Host "MaxAttempts : $MaxAttempts"
Write-Host "BaseBranch  : $BaseBranch"
Write-Host ""

function FindFailedJobId {
    param([long]$RunId, [string]$Repo)
    $runDetail = Get-Json "https://api.github.com/repos/$Repo/actions/runs/$RunId"
    if (-not $runDetail) { throw "Run not found: $RunId" }
    if ($runDetail.status -ne 'completed') {
        Write-Host "[skip] Run $RunId not completed yet."
        return $null
    }
    if ($runDetail.conclusion -eq 'success') {
        Write-Host "[done] Run $RunId already succeeded. No healing needed."
        return $null
    }
    $jobs = Get-Json $runDetail.jobs_url
    $failed = $jobs.jobs | Where-Object { $_.conclusion -in @('failure','cancelled','timed_out') }
    if (-not $failed) {
        Write-Host "[done] No failed jobs found in run $RunId."
        return $null
    }
    return [PSCustomObject]@{
        Run         = $runDetail
        FailedJob   = $failed[0]
        FailedJobs  = $failed
    }
}

function Get-FailedJobLogs {
    param([object]$FailedJob)
    $jobId = $FailedJob.id
    $logsUrl = "$($FailedJob.logs_url)"
    if (-not $logsUrl) {
        Write-Host "[warn] No logs_url for job $jobId"
        return ""
    }
    $response = Invoke-WebRequest -Uri $logsUrl -Headers $headers -Method Get
    $tempDir = [System.IO.Path]::GetTempPath()
    $zipPath = Join-Path $tempDir "ci-heal-$($RunId)-job-$($jobId)-logs.zip"
    [System.IO.File]::WriteAllBytes($zipPath, $response.Content)
    $extractDir = Join-Path $tempDir "ci-heal-$($RunId)-job-$($jobId)"
    if (Test-Path $extractDir) { Remove-Item $extractDir -Recurse -Force }
    Expand-Archive -Path $zipPath -DestinationPath $extractDir -Force
    $logFiles = Get-ChildItem -Path $extractDir -Recurse -File
    $logTexts = @()
    foreach ($f in $logFiles) {
        try {
            $logTexts += "===== $($f.Name) ====="; $logTexts += (Get-Content -LiteralPath $f.FullName -Raw -Encoding UTF8)
        } catch {}
    }
    return ($logTexts -join "`n")
}

function Get-CombinedLogText {
    param([string]$LogsDir)
    if (-not (Test-Path $LogsDir)) { return "" }
    $files = Get-ChildItem -LiteralPath $LogsDir -Recurse -File | Sort-Object { $_.FullName }
    $parts = foreach ($f in $files) {
        "===== $($f.Name) ====="; Get-Content -LiteralPath $f.FullName -Raw -ErrorAction SilentlyContinue
    }
    return ($parts -join "`n")
}

function Parse-Errors {
    param([string]$LogText)
    $errors = @()
    foreach ($line in ($LogText -split "`n")) {
        if ($line -match 'error\s+([A-Z]+[\d]+)(?::.*)?:\s+(.+?)(?:\s+\[(.+?)\])?$') {
            $errors += [PSCustomObject]@{ Code=$Matches[1]; Message=$Matches[2]; Target=$Matches[3]; Line=$line }
        }
    }
    return $errors
}

function Sanitize-Reason {
    param([string]$Text)
    $t = ($Text -replace "`r`n"," ")
    $t = ($t -replace '[^[:ascii:]]', '[nonascii]')
    if ($t.Length -gt 180) { $t = $t.Substring(0,177) + "..." }
    return $t
}

# ---- Diagnosis ----
$context = FindFailedJobId -RunId $RunId -Repo $Repo
if ($null -eq $context) { return }

$failedJob = $context.FailedJob
$logText = Get-FailedJobLogs -FailedJob $failedJob
$errors = Parse-Errors -LogText $logText

Write-Host "[diag] Job $($failedJob.name) ($($failedJob.id)) conclusion=$($failedJob.conclusion)"
Write-Host "[diag] Parsed $($errors.Count) C# compiler errors"

# ---- Fix engine (classification -> targeted patch) ----
function Is-Fixable {
    param($errors)
    $fixablePatterns = @(
        'CS0101'
    )
    foreach ($e in $errors) {
        if ($e.Code -in $fixablePatterns) { return $true }
    }
    return $false
}

function Get-DuplicateFieldDeclarations {
    param([string]$File, [string]$TextContent)
    $seen = @{}
    $duplicates = @()
    foreach ($line in ($TextContent -split "`n")) {
        $trimmed = $line.Trim()
        if ($trimmed -match '^\s*(private|protected|internal|public|readonly|const)\s+' -and
            $trimmed -match '^\s*(private|protected|internal|public|readonly|const)\s+(static\s+)?(readonly\s+)?(const\s+)?([A-Za-z_][\w<>,\s\.]*\s+)(_[A-Za-z_]\w*|[A-Za-z_]\w*)\s*[=;{]') {
            if ($seen.ContainsKey($trimmed)) { $duplicates += $trimmed }
            else { $seen[$trimmed] = $true }
        }
    }
    return $duplicates
}

function Remove-DuplicateFieldDeclarations {
    param([string]$Path, [string[]]$Duplicates)
    $content = [System.IO.File]::ReadAllText($Path)
    $original = $content
    $lines = $content -split "`r?`n"
    $seen = @{}
    $newLines = New-Object System.Collections.Generic.List[string]
    foreach ($raw in $lines) {
        $trimmed = $raw.Trim()
        if ($trimmed -match '^\s*(private|protected|internal|public|readonly|const)\s+' -and
            $trimmed -match '^\s*(private|protected|internal|public|readonly|const)\s+(static\s+)?(readonly\s+)?(const\s+)?([A-Za-z_][\w<>,\s\.]*\s+)(_[A-Za-z_]\w*|[A-Za-z_]\w*)\s*[=;{]') {
            if ($seen.ContainsKey($trimmed)) { continue }
            $seen[$trimmed] = $true
        }
        $newLines.Add($raw)
    }
    $newContent = ($newLines -join "`r`n")
    if ($newContent -ne $original) {
        $bakPath = "$Path.heal-bak"
        if (-not (Test-Path $bakPath)) {
            Copy-Item -LiteralPath $Path -Destination $bakPath -Force
            Write-Host "[patch] Backup written to $bakPath"
        }
        $utf8NoBom = New-Object System.Text.UTF8Encoding($false)
        [System.IO.File]::WriteAllText($Path, $newContent, $utf8NoBom)
        Write-Host "[patch] Removed duplicate declarations in $Path"
        return $true
    }
    return $false
}

$patchCount = 0
$patchedFiles = @()
if (Is-Fixable -errors $errors) {
    $csFiles = Get-ChildItem -LiteralPath $ciHealRoot -Recurse -Filter *.cs -ErrorAction SilentlyContinue |
               Where-Object { $_.FullName -notmatch '\\bin\\|\\obj\\|\\.git\\|packages\\|\\publish\\' }
    foreach ($f in $csFiles) {
        if ($f.Length -gt 0) {
            $contentTxt = [System.IO.File]::ReadAllText($f.FullName)
            $dups = Get-DuplicateFieldDeclarations -File $f.FullName -TextContent $contentTxt
            if ($dups.Length -gt 0) {
                if (Remove-DuplicateFieldDeclarations -Path $f.FullName -Duplicates $dups) {
                    $patchCount++
                    $patchedFiles += $f.FullName
                }
            }
        }
    }
    Write-Host "[patch] Applied $patchCount fix(es)"
} else {
    Write-Host "[skip] No fixable errors found"
}

# ---- Local build validation ----
$dotnetExe = 'dotnet'
$buildSuccess = $false
try {
    $proj = Get-ChildItem -LiteralPath "$ciHealRoot\src\AgnesWindows.Infrastructure" -Filter *.csproj -Recurse | Select-Object -First 1
    if ($proj) {
        $buildOut = & dotnet build $proj.FullName --no-restore --configuration Release --verbosity quiet 2>&1
        if ($LASTEXITCODE -eq 0) { $buildSuccess = $true }
    }
} catch {
    $buildSuccess = $false
}

if ($buildSuccess) {
    Write-Host "[build] Local infrastructure build verified after patches"
} else {
    Write-Host "[build] Local rebuild did not pass automatically (may need additional fixes)"
}

# ---- Git commit/push ----
function Write-HealPlan {
    try {
        $planDir = Join-Path $ciHealRoot '.kilo\plans'
        if (-not (Test-Path $planDir)) { New-Item -Path $planDir -ItemType Directory -Force | Out-Null }
        $timestamp = Get-Date -Format "yyyyMMddHHmmss"
        $planPath = Join-Path $planDir "ci-heal-AuthService-$timestamp.md"
        $errorSummary = ($errors | Select-Object -First 10 | ForEach-Object { $_.Line }) -join "`n"
        $body = @"
# CI Heal Plan
Run     : $RunId
Repo    : $Repo
Created : $(Get-Date -Format o)

## Diagnoses
"" + $errorSummary + ""

## Fixes
- Removed duplicate field declarations via ci-heal.ps1

## Files Patched
" + ($patchedFiles -join "`n") + "

## Attempts
0: initial
"@
        Set-Content -LiteralPath $planPath -Value $body -Encoding UTF8
    } catch {}
}

Write-HealPlan

if ($DryRun -or $patchCount -eq 0) {
    Write-Host "[exit] DryRun or no patches applied."
    return
}

$branch = "ci-heal/run-$RunId"
git fetch origin $BaseBranch 2>$null
git branch -D $branch 2>$null

try {
    $head = git symbolic-ref "refs/remotes/origin/$BaseBranch" 2>$null
    if (-not $head) { $head = "origin/$BaseBranch" }
} catch { $head = "origin/$BaseBranch" }

git checkout -b $branch $head | Out-Null
git add -A
$diff = (git diff --cached --stat) -join "`n"
$diffFull = (git diff --cached) -join "`n"
$commitMsg = "[ci-heal] Fix CI failure run $RunId - duplicate declaration ($patchCount files)"
git commit -m $commitMsg | Out-Null

if (-not $NoPush) {
    git push origin $branch | Out-Null
}

# ---- PR creation ----
$title = "[ci-heal] Automated fix for CI run $RunId"
$bodySnippet = ($errors | Select-Object -First 10 | ForEach-Object {
    "$($_.Code): $($_.Message)"
}) -join "`n"
$prBody = @"
This PR auto-fixes CI run **$RunId** failure.

### Detected errors
" + $bodySnippet + @"

### Changes
" + $diff + @"

### Full diff
" + $diffFull + "
"@

$pr = $null
if (-not $NoPR -and -not $DryRun) {
    try {
        $pr = Invoke-GitHub `
            -Uri "https://api.github.com/repos/$Repo/pulls" `
            -Method Post `
            -Body ([PSCustomObject]@{
                title = $title
                head  = $branch
                base  = $BaseBranch
                body  = $prBody
            })
        Write-Host "[pr] Opened $($pr.html_url)"
    } catch { Write-Host "[error] PR creation failed: $_" }
}

# ---- Re-trigger workflow on the new branch ----
try {
    $wfd = [PSCustomObject]@{ ref = $branch }
    Invoke-GitHub -Uri "https://api.github.com/repos/$Repo/actions/workflows/$WorkflowFile/dispatches" -Method Post -Body $wfd | Out-Null
    Write-Host "[workflow] Re-dispatched '$WorkflowFile' on branch '$branch'"
} catch {
    Write-Host "[error] Workflow dispatch failed: $_"
}

Write-Host ""
Write-Host "[exit] CI healer completed. Watch $($pr.html_url) for results."
