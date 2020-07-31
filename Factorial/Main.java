#include<iostream>
using namespace std;
int fact (int N){
  int factorial;
  if (N==0) {
    factorial = 1;
  }
  else{
  factorial = N * fact(N-1);}
  return factorial;
}
int main()
{
  //Type your code here.
  int n,result;
  cin>>n;
  result = fact(n);
  cout<<"The factorial of "<<n<<" is "<<result<<endl;
  return 0;
}
