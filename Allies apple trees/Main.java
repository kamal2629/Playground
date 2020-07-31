#include<iostream>
#include<cstdlib>
using namespace std;

int main()
{
  //Type your code here
  int x;
  cin>>x;
  int i = 0 ;
  int j =0 ;
  int temp_apple = 0;
  int k = 0;
  int perimeter;
  if(x==0)
    cout<<"0"<<endl;
  else{
    while(temp_apple <= x){
      k++;
      for(i = -k ; i <= k ; i++){
        for(j = -k ; j <= k ; j++){
          temp_apple = temp_apple + abs(i) + abs(j);
        }
      }
    }
    perimeter = 8 * k;
    cout<<perimeter<<endl;
  }

  return 0;
}
