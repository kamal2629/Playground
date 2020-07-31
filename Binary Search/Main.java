#include<iostream>
using namespace std;

int binarysearch(int a[] , int si , int ei , int x){
  int mid = (si + ei)/2;
  int result;
  if(si > ei){
    return -1;
  }
  else{
    if(x < a[mid]){
      result = binarysearch(a , si , mid-1,x);
    }
    else if(x == a[mid]){
      result = mid;
    }
    else{
      result = binarysearch(a , mid+1 , ei , x);
    }
    return result;
    }
}

int main()
{
  //Type your code here
  int n;
  cin>>n;
  
  int* sortedarray = new int[n];
  
  for(int i = 0 ; i < n ; i++){
    cin>>sortedarray[i];
  }
  
  int element;
  cin>>element;
  
  int checkfound = binarysearch(sortedarray , 0 , n-1 ,element);
  
  if(checkfound == -1){
    cout<<"Not found"<<endl;
  }
  
  else{
    cout<<checkfound<<endl;
  }
  return 0;
}