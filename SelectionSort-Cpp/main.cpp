#include <iostream>

using namespace std;
void selectionSort(int arr[],int n)
{
    int temp;
    int minindx;
    for(int i = 0;i<n-1;i++){
        minindx = i;
        for(int j = i+1;j<n;j++){
            if(arr[minindx] < arr[j]){
                swap(arr[minindx], arr[j]);
        }
    }
}
}
void print(int arr[],int n )
{
     for (int i =0;i<n;i++)
        cout<<arr[i]<<"   "<<endl;
     cout<<endl;

}
int main()
{
   int arr[]={60,40,50,30,10,20};
   int n =sizeof arr/sizeof(arr[0]);
   print( arr,n );
   selectionSort (arr,n);
   cout<<"after selection sort\n";
   print(arr,n);

   return 0;
}
