#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  long long int count = 0;
  long long int output =0 ;
  cin>>count;
  long long int a[3] = { 0 , 1 };
  if (count == 1){
    output  = 0;
  }
  else if (count == 2 ){
    output = 1;
    }
  else{
    while((count - 2) != 0){
      a[2] = a[1] + a[0];
      a[0] = a[1];
      a[1] = a[2] ;
      count -- ;
    }
    output = a[2];
  }
  cout << output <<endl;
  return 0;
}
