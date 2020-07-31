#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  long long int x,y;
  cin>>x>>y;
  long long int gcd = 0;
  int less;
  if( x >= y)
    less = y;
  else 
    less = x;
  for(int i = 1; i <= less ; i++){
    if((x % i == 0) && (y % i ==0))
      gcd = i;
  }
  cout<<gcd<<endl;
  return 0;
}