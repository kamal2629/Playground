#include<iostream>

using namespace std;

int prime_result(int n){
    int status = 100;                // status = 0 (not prime)    status = 1(prime)
    if(n == 1){
        status = 0;
    }
    else if(n ==2){
        status = 1;
    }
    else{
        for(int i = 2 ; i < n ; i++){
            if( n % i == 0){
                status = 0;
                break;
            }
            else{
                status = 1 ;
            }
        }
    }
    return status;

}

int main(){
    int n1 = 0;
    int n2 = 0;
    int a[100] = {0};
    int count = 0;
    cin>>n1;
    cin>>n2;
    int check = 100;
    int less = 0;
    if( n1 >= n2)
        less = n2;
    else
        less = n1;
    for(int i = 1 ; i <= less ; i++){
        if((n1 % i ==0 ) && (n2 % i ==0)){
            check = prime_result(i);
            //cout<<i<<" res: "<<check<<endl;
            if(check == 1){
                a[count] = i;
                count++;
            }
            else{
                continue;
            }
        }
    }
    /*for(int i  = 0 ; i < count ; i++)
        cout<<a[i]<<" ";*/
    int max = 0;
    if(count == 0)
        max = -1;
    else{
        for(int i = 0 ; i < count ; i++){
            if(a[i] >= max)
                max = a[i];
            else
                continue;
        }
    }
    cout<<max<<endl;
    return 0 ;
}
