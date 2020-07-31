#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int row , col ;
  int a,b;
  int sum_row,sum_col;
  sum_row  = 0;
  sum_col = 0;
  cin>>row;
  cin>>col;
  int x[row][col];
  for(int i = 0 ; i < row ; i++ ) {
    for(int j = 0 ; j < col ; j++)
      cin>>x[i][j];
  }
  cin>>a;
  cin>>b;
  for(int i = 0 ; i< col ; i++){
    sum_row = sum_row + x[a][i];}

  for (int j =0 ; j< row ; j++){
    sum_col =  sum_col + x[j][b];
  }
  cout<<sum_row + sum_col - x[a][b]<<endl;

  return 0;
}
