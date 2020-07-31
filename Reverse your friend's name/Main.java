#include<iostream>
#include<string>
using namespace std;
int main()
{
//Type your code here
  string s;
  getline(cin,s);
  string rev;
  int len = s.size();
  for(int i = 0 ; i<len ; i++){
    rev[len - 1 - i] = s [i];
  }
  for(int i = 0 ; i<len ; i++){
    cout<<rev[i];
  }
  return 0 ;
}
