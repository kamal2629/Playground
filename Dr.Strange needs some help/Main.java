#include<iostream>
#include<cmath>

using namespace std;

int main(){
  int m,n,req;
  cin>>m;
  cin>>n;
  cin>>req;
  if(pow(m,n) >= req){
    cout<<"Doctor, you can proceed with your experiment."<<endl;
  }
  else{
    cout<<"Sorry Doctor! You need more bacteria."<<endl;
  }
  return 0;
}