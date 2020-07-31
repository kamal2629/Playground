#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n;
  cin>>n;
  int am[n];
  for(int i = 0 ; i < n ; i++){
    cin>>am[i];
  }
  int diff = (am[n-1] - am[0])/(n-1);
  
  for(int i = 1 ; i <= n-1 ; i++){
    if(am[i] - am[i-1] != diff){
      cout<<am[i-1] + diff<<endl;
      break;
    }
  }
  
  return 0;
}