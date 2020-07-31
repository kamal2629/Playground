#include<iostream>
using namespace std;

int sum(int n){
  int s = 0;

  while(n != 0){
    s = s + n % 10;
    n = n /10;
  }
  return s;
}

int main()
{
  //Type your code here
  //int T;
  int n;
  int d;
  //cin>>T;
  cin>>n>>d;
//  cout<<sum_cal<<endl;
  int count = 0;
  for(int i = 1 ; i <= n ; i++){
    int sumofdigits = sum(i);
    if( i - sumofdigits >= d)
      count++;
  }
  cout<<count<<endl;

  return 0;
}
