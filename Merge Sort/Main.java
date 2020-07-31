#include <iostream>
using namespace std;

void combinesort(int a[] , int si ,int ei){
  int size = ei - si + 1;
  int mid= (si + ei )/2;
  int i = si ;
  int j = mid+1;
  int b[size];
  int k = 0;

  while( i <= mid && j <= ei){
    if(a[i] > a[j]){
      b[k] = a[j];
      j++;
      k++;
    }
    else{
      b[k] = a[i];
      k++;
      i++;
  }
}
  while(i <= mid){
    b[k] = a[i];
    k++;
    i++;
  }

  while(j <= ei){
    b[k] = a[j];
    k++;
	j++;
  }
  int d = 0;
  for(int z = si ; z <= ei ; z++){
    a[z] = b[d];
    d++;
  }
}


void mergesort(int a[] , int si ,int ei){
  if(si >= ei)
    return;
  int mid = (si + ei)/2;
  mergesort(a , si , mid);
  mergesort(a , mid+1 , ei);
  combinesort(a, si , ei);
}

int main()
{
   // Try out your code here
    //cout << "Hello, World";
  int size;
  cin>>size;
  int arr[size];

  for(int i = 0 ; i < size ; i++){
    cin>>arr[i];
    //cout<<endl;
  }

  cout<<"Before Sort:"<<endl;
  for(int i = 0 ; i < size ; i++){
    cout<<arr[i]<<" ";
  }
  cout<<endl;

  mergesort(arr , 0 , size-1);

  cout<<"After Sort:"<<endl;
  for(int i = 0 ; i < size ; i++){
    cout<<arr[i]<<" ";
  }
  cout<<endl;

  return 0;
}
