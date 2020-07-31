#include<iostream>
using namespace std;

int robcollect(int arr[] , int n){
  int inc1 = arr[0];
  int exc1 = 0 ;
  int exc1_new;
  for(int i = 1 ; i < n ; i++){
    exc1_new = (inc1 > exc1) ? inc1 : exc1;
    inc1 = exc1 + arr[i];
    exc1 = exc1_new;
  }

  return ((inc1 > exc1) ? inc1 : exc1);
}

int main(){
  int n;
  cin>>n;
  int *robarr = new int[n];
  for(int i = 0 ; i < n ; i++){
    cin>>robarr[i];
  }

  int robamount = robcollect(robarr , n );

  cout<<robamount<<endl;
}
