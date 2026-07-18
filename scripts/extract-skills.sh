#!/bin/bash

RAW_PATH="src/AgnesWindows.Skills/raw"
EXTRACTED_PATH="src/AgnesWindows.Skills/extracted"

echo "Extracting skill sections from $RAW_PATH to $EXTRACTED_PATH"

if [ ! -d "$RAW_PATH" ]; then
    echo "Raw path not found: $RAW_PATH"
    exit 1
fi

mkdir -p "$EXTRACTED_PATH"

for file in "$RAW_PATH"/*.md; do
    if [ ! -f "$file" ]; then
        echo "No .md files found in $RAW_PATH"
        exit 0
    fi
    
    echo "Processing $(basename "$file")..."
    
    content=$(cat "$file")
    lines=()
    IFS=$'\n' read -r -d '' -a lines <<< "$content"
    
    relevant=()
    capture=false
    heading_depth=0
    
    for line in "${lines[@]}"; do
        if [[ "$line" =~ ^#+ ]]; then
            heading=$(echo "$line" | sed 's/^#+//' | tr '[:upper:]' '[:lower:]' | xargs)
            if [[ "$heading" =~ prompt|image|video|skill|workflow|guide|"best practice"|structure ]]; then
                capture=true
            else
                capture=false
            fi
            heading_depth=$(echo "$line" | grep -o '^#*' | wc -c)
        elif [ "$capture" = true ] && [[ "$line" =~ ^#+ ]]; then
            new_heading_depth=$(echo "$line" | grep -o '^#*' | wc -c)
            if [ "$new_heading_depth" -le "$heading_depth" ]; then
                capture=false
            fi
        fi
        
        if [ "$capture" = true ] && [ -n "$(echo "$line" | xargs)" ]; then
            relevant+=("$line")
        fi
    done
    
    output=$(printf '%s\n' "${relevant[@]}")
    outfile="$EXTRACTED_PATH/$(basename "$file" .md).extracted.md"
    echo "$output" > "$outfile"
    
    echo "  -> $outfile (${#output} chars)"
done

echo "Extraction complete."