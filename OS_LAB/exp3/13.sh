#! /bin/bash
echo "Enter number: "
read n
echo "Enetred number is $n"
reverse=0
while [ $n -gt 0 ]
do
	r=$(( n%10 ))
	reverse=$(( reverse*10 + $r ))
	n=$(( n/10 ))
done
echo "Reverse number is $reverse"
