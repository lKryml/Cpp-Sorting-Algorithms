#include <iostream>

using namespace std;
void bubbleSort(int arr[],int n)
{
    for (int i =0;i<n;i++){
        for(int j=1;j<(n-i);j++){
            if (arr[j-1]>arr[j])
                swap(arr[j-1],arr[j]);
        }
    }
}

void print(int arr[],int n)
{
    for (int i =0;i<n;i++)
        cout<<arr[i]<<" ";

cout<<endl;
}
int main()
{
   int arr[]={14,46,43,27,57,41,45,21,70};
   int n =sizeof arr/sizeof(arr[0]);
   print( arr,n );
   bubbleSort (arr,n);
   cout<<"after bubble sort"<<endl;
   print(arr,n);
}
