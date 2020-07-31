#include<iostream>

int power(int m,int n)
{
    int i,j;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  	int temp = n ;
  	int count = 0;
  	int x = n;
  	int y =n;
  	int temp_sum = 0;
  	while (temp != 0){
     temp = temp / 10;
     count = count +1 ;
    }
    
  	while(y != 0){
      x= y%10;
      y = y/10;
      
      temp_sum = temp_sum + power(x,count);
      
    }
  	
  	return temp_sum;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
  	return 0;

}
