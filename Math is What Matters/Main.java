#include<iostream>
using namespace std;

int count_digits(long long int n){
  int count = 0;
  while(n != 0){
    n = n/10;
    count++;
  }
  return count;
}

long long int power_digit(long long int n , int count){
  int power = 1;
  for (int i =1 ; i <= count ; i++){
    power = power * n;
  }
  return power;
}

long long int arm(long long int n , int count){
  long long int sum = 0;
  int temp;
  temp = count;
  long long int x,y;
  x= n;
  y= n;
  while (temp != 0){
    x = x % 10;
    sum = sum + power_digit(x,count);
    y = y / 10;
    x = y;
    temp -- ;
  }
  return sum;
}
int main()
{
  //Type your code here
  long long int n;
  cin>>n;
  int count = count_digits(n);
  long long int sum = arm(n,count);
  if (sum == n)
    cout<<"Yes"<<endl;
  else
    cout<<"No"<<endl;

  return 0 ;
}
