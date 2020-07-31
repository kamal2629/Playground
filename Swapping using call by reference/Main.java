#include <iostream>
using namespace std;
void swap(int &x , int &y){
  int temp =0;
  temp = x;
  x = y;
  y = temp;
}

int main() 
{
   // Try out your code here
    int a,b;
  	cin>>a>>b;
  	cout<<"Before swapping a= "<<a<< " and b="<<b<<endl;
  	swap(a,b);
  	cout<<"After swapping a= "<<a<< " and b="<<b<<endl;
    return 0;
}