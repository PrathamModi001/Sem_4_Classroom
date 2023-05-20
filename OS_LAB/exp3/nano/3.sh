

echo "Enter a string:"
read input_string

uppercase_string=$(echo "$input_string" | tr '[:lower:]' '[:upper:]')

echo "Uppercase string: $uppercase_string
