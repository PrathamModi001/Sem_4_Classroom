echo "-----Even or Odd shell Script-----"
echo "Enter a number: "
read n
echo "Result: "
if [ `expr $n % 2 ` == 0 ]
then
	echo "$n is even"
else
	echo "$n is odd"
fi
