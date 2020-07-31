#include<iostream>
using namespace std;
int main()
{
  
  // Type your code here
  int n;
  cin>>n;
  int arr[20];
  for(int i =0 ; i<n ; i++){
    cin>>arr[i];
  }
  int result;
  int match;
  cin>>result;
  for (int i = 0 ; i<n ; i++){
    if(arr[i] == result){
      match = 1;
      break;
    }
    else{
      match = 0;
      continue;
    }
  }
  if(match ==1)
    cout<<"She passed her exam"<<endl;
  else
    cout<<"She failed"<<endl;
  return 0;
  
}