#include<iostream>
using namespace std;
int small_all(int a, int b , int c){
  int small = 0;
  if (a <= b && b <= c){
    small = a;
  }
  else if (a >= b && b <= c){
    small = b;
  }
  else {
    small = c;
  }
  return small;
}
int main()
{
    int a,b,c,gcd1,res,ans;
    std::cin>>a>>b>>c>>ans;
   //Your code goes here
    int small = small_all(a,b,c);
  	while (small >=1){
      if (a % small == 0 && b % small == 0 && c % small == 0){
        gcd1 = small;
        break;
      }
      small --;
    }
  	if( gcd1 == ans){
      cout << "Answer is correct."<<endl;
    }
  	else {
      cout << "Answer is wrong."<<endl;
    }
  	return 0;
}