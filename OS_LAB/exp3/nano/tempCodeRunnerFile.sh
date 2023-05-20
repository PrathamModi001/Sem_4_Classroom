# Read the integers from numbers.txt and calculate their sum
sum=0
while read number
do
  sum=$((sum + number))
done < numbers.txt

# Append the sum to output.txt
echo "The sum is:" $sum >> output.txt

# Display the contents of output.txt
cat output.txt
