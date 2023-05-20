#! /bin/bash
echo "Enetr two numbers: "
read num1
read num2
echo "The sum of two numbers is: "
echo $num1 + $num2 | bc
