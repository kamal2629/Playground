#include<iostream>
#include<algorithm>
using namespace std;


int calc(int a[] , int b[] , int n , int k ){
    int* temparr = new int[n];
    int res = 0;
    int i = 0 ;
    int j = 0 ;
    int temp;
    while( i < n && j < n){
        int p = a[i]*b[i];
        if(p > 0  && a[i] > 0 ){
            temp = a[i] - 2*k;
        }
        else if(p > 0 && a[i] < 0){
            temp = a[i] + 2*k;
        }
        else if(p < 0 && a[i] < 0){
            temp = a[i] + 2*k;
        }
        else if(p < 0 && a[i] > 0){
            temp = a[i] - 2*k;
        }
        for(int k = 0 ; k < n ; k++){
            if( i == k){
                res = res + temp * b[k];
            }
            else{
                res = res + a[k]*b[k];
            }
        }
        temparr[i] = res;
        res = 0;
        i++;
        j++;
    }
    sort(temparr ,temparr + n);
    return temparr[0];
}

int main()
{
  //Type your code here
  int n;
  cin>>n;
  int* a = new int[n];
  int* b = new int[n];
  for(int i = 0 ; i  < n ; i++){
    cin>>a[i];
  }

  for(int i = 0 ; i  < n ; i++){
    cin>>b[i];
  }
  int k;
  cin>>k;
  int maxsumofproduct = calc(a , b , n , k);
  cout<<maxsumofproduct<<endl;
  return 0;
}
