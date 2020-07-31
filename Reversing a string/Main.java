#include <iostream>
using namespace std;
int main()
{
  char str[100], rev[100];
  //int count = 0, end, i;
  //Your code goes here
  for(int i = 0; i <100 ; i++){
    str[i]= '\0';
    rev[i] = '\0';
  }
  cin.getline(str,100);
  for(int i = 0 ; i < 100 ; i++){
    rev [99-i] = str [i];
  }
  for (int i = 0; i<100 ; i++){
    if(rev[i] == '\0'){
        continue;
    }
    else{
    cout<<rev[i];}
  }
}
