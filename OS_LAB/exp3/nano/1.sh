height=5  # define the height of the triangle

for ((i=0; i<height; i++)); do
    # print spaces before each row
    for ((j=0; j<height-i-1; j++)); do
        echo -n " "
    done
    # print asterisks in the shape of a triangle
    for ((j=0; j<2*i+1; j++)); do
        if [[ $j -eq 0 || $j -eq 2*i || $i -eq $((height-1)) ]]; then
            echo -n "*"
        else
            echo -n " "
        fi
    done
    echo  # move to the next line
done
