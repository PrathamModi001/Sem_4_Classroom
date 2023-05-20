echo "Enter P:"
read p
echo "Enter R:"
read r
echo "Enter T:"
read t
echo -n "Simple interest: "
si=$(( p * r* t/100))
echo "$si" 
