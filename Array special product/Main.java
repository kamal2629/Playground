#include<iostream>
using namespace std;

void arraymultiply(int a[] , int n){
  int b[n];
  int i = 0;
  int p = 1;
  while( i < n){
    for(int j = 0 ; j < n ; j++){
      if(i != j){
        p = p * a[j];
      }
    }
    b[i] = p;
    cout<<b[i]<<endl;
    p = 1;
    i++;
  }
}

int main()
{
  //Type your code here
  int n;
  cin>>n;

  int* array = new int [n];

  for(int i = 0 ; i < n ; i++){
    cin>>array[i];
  }

  arraymultiply(array , n);




  delete []array;
  return 0;
}
