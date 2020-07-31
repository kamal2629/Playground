#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  long long int n;
  int exponent;
  cin>>n;
  cin>>exponent;
  long long int result = 1;
  for(int i =1 ; i<= exponent ; i++){
    result = result * n;
  }
  cout<<result<<endl;
  return 0;
}