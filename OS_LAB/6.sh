echo "Enter size: "
read size
sum=0
echo "enter numbers: "
for(( i=1; i<=size ; i++ ))
do
	read num
	sum=$(( sum+num ))
done
echo $sum
