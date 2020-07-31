#include<iostream>
using namespace std;
int smallest(int p[] , int n){
  int min = 9;
  for(int k = 0 ; k <= n-1 ; k++){
    if(p[k] < min)
      min = p[k];
  }

  return min;
}
int largest(int p[] ,int n){
  int max = 0;
  for(int k =0 ; k<= n-1 ;k++){
    if(p[k] > max)
      max = p[k];
  }

  return max;
}
int main()
{
  //Type your code here
  int in1 , in2 , in3;
  cin>>in1;
  cin>>in2;
  cin>>in3;
  int a[3]={in1 , in2 , in3};
  int out[4];
  int pass[3];
  int i = 0;
  while(i <=3){
    for(int j = 0 ; j <= 2 ; j++){
      pass[j] = a[j] %10;
      a[j] = a[j]/10;
    }

    if(i == 0 || i == 2){
      out[i] = largest(pass , 3);
      //cout<<out[i]<<" ";
    }
    else{
      out[i] = smallest(pass , 3);
    }

    i++;
  }
  cout<<out[3]<<out[2]<<out[1]<<out[0]<<endl;
  return 0;
}
