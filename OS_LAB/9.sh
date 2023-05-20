echo "enter term"
read n
echo "fibonacci series"
a=0
b=1
echo -n $a
echo -n " "
echo -n $b
for (( i=3; i<=$n; i++ ))
do
	c=`expr $a + $b`
	a=$b
	b=$c
	echo -n " "
	echo -n $c 
done
echo " "
