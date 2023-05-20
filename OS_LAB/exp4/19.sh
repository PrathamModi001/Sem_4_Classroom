#! /bin/bash
echo $1 $2 $3 $4 $5
if [ $# -eq 5 ]
then
	echo "Valid Arguments"
else
	echo "Invalid Argements"
fi
