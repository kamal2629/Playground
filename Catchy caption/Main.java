#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char str[100];
  cin.getline(str,100);
  int count = 1;
  int len = strlen(str);
  for(int i =0 ; i<len ; i++){
    if(str[i] == ' '){
        count += 1;
    }
    else
        continue;
  }
  if(count <= 10)
    cout<<"Caption eligible for the contest"<<endl;
  else
    cout<<"Caption not eligible for the contest"<<endl;
  return 0;
}
