#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

void minimumnumbercoin(int cr[] , int n , int x){
  vector<int>change;
  int i = 0;
  while(i < n){
    if(cr[i] <= x){
      change.push_back(cr[i]);
      x = x - cr[i];
  }
  else{
    i++;
  }
  }

  for(unsigned int i = 0 ; i < change.size(); i++){
    cout<<change.at(i)<<"  ";
  }
}

int main()
{
  //Type your code here
  int availablecurrency[9] = {1,2,5,10,20,50,100,500,1000};
  sort(availablecurrency , availablecurrency + 9 , greater<int>());
  int currencychange;
  cin>>currencychange;
  minimumnumbercoin(availablecurrency , 9 , currencychange);
  return 0;
}
