#include<iostream>
using namespace std;
int digits(int x){
  int temp = x;
  int count = 0;
  while(temp != 0){
    temp = temp / 10;
    count = count + 1;
  }
  return count;
}

int sum(int x, int count){
    int sum = 0;
    while(count != 0){
        sum = sum + x%10;
        x= x/10;
        count--;
    }
    return sum;

}

int main(){
  int n;
  cin>>n;
  int count = 0;
  int sum_check = n;
  count = digits(n);
  sum_check = sum(sum_check,count);
  while (count != 1){
    sum_check = sum(sum_check,count);
    count = digits(sum_check);
  }

  cout<<sum_check<<endl;
  return 0;
}
