#include<iostream>
using namespace std;
int main()
{
  //Type your code 
  long long int n;
  cin>>n;
  int count = 0;
  int sum = 0;
  int *p = new int[n/2];
  for(int i = 1 ; i <= n/2 ; i++){
    if( n % i == 0){
      *(p + count) = i;
      count++;
    }
  }
  for(int i = 0 ; i < count ; i++){
    sum = sum + (*(p+i));
  }
  if(sum == n)
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;
  delete []p;
  p = NULL;
}