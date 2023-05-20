#include<iostream>
using namespace std;

void swap(int *x , int *y){
    int temp = *x;
    *x = *y;
    *y = temp;
}

void selectionSort(int arr[] , int size){
    int i,j,min_index;
    for(int i=0;i<size-1;i++){
        min_index = i;
        for(j=i+1;j<size;j++){
            if(arr[j] < arr[min_index]){
                min_index = j;
            }
        }
        if(min_index!=i){
            swap(&arr[min_index] , &arr[i]);
        }
    }
}

void printArray(int arr[] , int size){
    for(int i=0;i<size;i++){
        cout << arr[i] << " ";
    }
}

int main()
{
    int arr[] = {64, 25, 12, 22, 11};
    int size = sizeof(arr) / sizeof(arr[0]);
    
    cout<< " Before Applying Selection Sort"<< endl;
    printArray(arr , size);

    selectionSort(arr , size);
    cout<< endl<< " APPLYING SELECTION SORT"<< endl;
    printArray(arr , size);
    return 0;
}