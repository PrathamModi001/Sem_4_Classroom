#include<iostream>
using namespace std;

void merge(int arr[] , int left, int mid, int right){
    // dividing the main array into 2 parts wrt mid
    auto arrayOneIndex = mid - left + 1;
    auto arrayTwoIndex = right - mid;

    // allocating size to the left and the right sides of the array
    int leftArray[arrayOneIndex]; 
    int rightArray[arrayTwoIndex];

    // allocating the elements into the left and the right part of the array: 
    for(int i=0;i<arrayOneIndex;i++){
        leftArray[i] = arr[arrayOneIndex + i];
    }
    for(int j=0; j<arrayTwoIndex;j++){
        rightArray[j] = arr[arrayTwoIndex + j];
    }

    
    int i = 0

}

int main()
{
    

    return 0;
}