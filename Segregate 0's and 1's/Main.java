#include <iostream>
#include<string>
using namespace std;

int main()
{
   // Try out your code here
  string input;
  cin>>input;
  int count0 = 0;
  int count1 = 0;
  for(int i =0 ; i < input.size() ; i++){
    if(input[i] == '0')
      count0++;
    else if(input[i] == '1')
      count1++;
  }
  //cout<<count0<<" "<<count1<<endl;

  for(int i = 1 ; i <= count1 ; i++){
    cout<<"1";
  }
  for(int i = 1 ; i <= count0 ; i++){
    cout<<"0";
  }
  return 0;
}
