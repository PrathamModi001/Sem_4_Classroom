echo "enter term"
read n
echo "fibonacci series: "
echo -n "$b"
for((i=1; i<=$n; i++))
do 
c=`expr $a + $b`a=$b
b=$c
echo -n "$c"
done