#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  long long int n;
  cin>>n;
  int result;
  if(n ==1)
    cout<<"Not Prime"<<endl;
  else {
    for(long long int i = 2 ; i < n ; i++){
      if(n % i == 0){
        result = 1;
        break;
      }
      else
        result = 0;
    }
    if (result == 0)
      cout<<"Prime"<<endl;
    else if (result == 1)
      cout<<"Not Prime"<<endl;
  }
  return 0;
}
