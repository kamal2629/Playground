#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int lowest , largest;
  cin>>lowest;
  cin>>largest;
  int sum = 0 ;
  while(lowest % 15 != 0){
    lowest++;
  }
  while(lowest != largest && lowest <= largest){
    sum = sum + lowest;
    lowest = lowest + 15;
  }
  cout<<sum<<endl;
  return 0;
}
