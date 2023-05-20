sum=0
# Read each number from numbers.txt and add it to the sum
# Initialize an empty array
sum=0

# Read the contents of the file into the array
cat numbers.txt | while read line; do
  sum+=($line)

done

echo $sum


# Append the sum to result.txt
# echo "The sum is: $sum">> result.txt