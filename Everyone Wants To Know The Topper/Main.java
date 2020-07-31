#include<iostream>
using namespace std;
int main()
{
  int n ;
  int arr[20];
  cin>>n;
  for (int i=0 ; i <n ; i++){
    cin>>arr[i];
  }
  int max = 0;
  for (int i = 0 ; i<n ; i++){
    if (arr[i] >= max){
      max = arr[i];
    }
    else {
      continue;
    }
  }
  cout<<max<<endl;
  return 0;
}
