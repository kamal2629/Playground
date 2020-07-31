#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r,c;
  cin>>r>>c;
  int matrix1[r][c];
  int matrix2[r][c];
  for(int i =0 ; i<r ; i++){
    for(int j =0 ; j < c ; j++){
      cin>>matrix1[i][j];
    }
    //cout<<endl;
  }
  for(int i =0 ; i<r ; i++){
    for(int j =0 ; j < c ; j++){
      cin>>matrix2[i][j];
    }
    //cout<<endl;
  }
  int add[r][c];
  for (int i=0 ; i<r ; i++){
    for(int j =0 ; j <c ; j++){
      add[i][j] = matrix1[i][j] + matrix2[i][j];
    }
  }

  for (int i=0 ; i<r ; i++){
    for(int j =0 ; j <c ; j++){
      cout<<add[i][j]<<" ";
    }
    cout<<endl;
  }
  return 0;
}
