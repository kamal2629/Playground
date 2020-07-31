#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
  int n;
  int count_male = 0;
  int count_female = 0;
  cin>>n;
  int *p = (int*) calloc( n , n * sizeof(int));
  for (int i =0 ; i < n ; i++) {
    cin>>*(p+i);
  }
  for(int i = 0; i < n ; i++){
    if((*(p+i)) % 2 == 0 )
      count_female = count_female + 1;
    else 
      count_male = count_male + 1;
  }
  cout<<count_male<<endl;
  cout<<count_female<<endl;
  free(p);
  p = NULL;
  return 0;
}