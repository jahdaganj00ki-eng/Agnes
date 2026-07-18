param(
    [string]$RawPath = "src\AgnesWindows.Skills\raw",
    [string]$ExtractedPath = "src\AgnesWindows.Skills\extracted"
)

Write-Host "Extracting skill sections from $RawPath to $ExtractedPath"

if (-not (Test-Path $RawPath)) {
    Write-Error "Raw path not found: $RawPath"
    exit 1
}

New-Item -ItemType Directory -Force -Path $ExtractedPath | Out-Null

$files = Get-ChildItem -Path $RawPath -Filter *.md
if (-not $files) {
    Write-Warning "No .md files found in $RawPath"
    exit 0
}

foreach ($file in $files) {
    Write-Host "Processing $($file.Name)..."
    
    $content = Get-Content -Path $file.FullName -Raw
    $lines = $content -split "`n"
    
    $relevant = @()
    $capture = $false
    $headingDepth = 0
    
    foreach ($line in $lines) {
        if ($line -match '^#+') {
            $heading = $line.TrimStart('#').Trim().ToLower()
            $capture = $heading -match 'prompt|image|video|skill|workflow|guide|best practice|structure'
            $headingDepth = ($line.ToCharArray() | Where-Object { $_ -eq '#' }).Count
        }
        elseif ($capture -and $line -match '^#+') {
            $newHeadingDepth = ($line.ToCharArray() | Where-Object { $_ -eq '#' }).Count
            if ($newHeadingDepth -le $headingDepth) {
                $capture = $false
            }
        }
        
        if ($capture -and $line.Trim()) {
            $relevant += $line
        }
    }
    
    $output = $relevant -join "`n"
    $outFile = Join-Path $ExtractedPath ($file.BaseName + ".extracted.md")
    Set-Content -Path $outFile -Value $output -Encoding UTF8
    
    Write-Host "  -> $outFile ($($output.Length) chars)"
}

Write-Host "Extraction complete."
