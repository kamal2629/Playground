#include<iostream>
#include<cmath>
using namespace std;
int no_of_digits(long long int n){
  int count=0;
  while(n!=0){
    count++;
    n=n/10;
  }
  return count;
}
int main()
{
  long long int n;
  cin>>n;
  int m=no_of_digits(n);
  int diff=0;
  for(int i=m;i>=1;i--){
    int a=n%10;
    diff=diff+((pow(-1,i))*a);
    n=n/10;
  }
  if (diff >= 0)
    cout<<diff<<endl;
  else{
    diff = (-1) * diff;
    cout<<diff<<endl;
  }
  return 0;
}