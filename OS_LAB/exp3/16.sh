#! /bin/bash
echo "Enter a number: "
read n
echo "Entered number is $n"
while [ $n -gt 0 ]
do
	x=$(( n%10 ))
	sumn=$(( sumn+$x ))
	n=$(( n/10 ))
done
echo "Sum of digits of the number is $sumn"

