    #include<iostream>
    using namespace std;

    void printArray(int arr[] , int n){
        for(int i=0; i<n; i++){
            cout<< arr[i] << " ";
        }
    }

    void insertionSort(int arr[] , int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    int main()
    {
        int arr[] = {12, 11, 13, 5, 6};
        int n = sizeof(arr) / sizeof(arr[0]);
        insertionSort(arr,n);
        cout<<"INSERTION SORT DONE: "<<endl;
        printArray(arr , n);
        return 0;
    }