#include<iostream>
using namespace std;

int count_digits(long long int n){
    int count = 0;
    while ( n != 0){
        n = n/10;
        count++;
    }
    return count;
}

int sum_digits (long long int n){
    int sum = 0;
    while(n != 0 ){
        sum = sum + n %10;
        n = n /10;
    }
    return sum;
}

int main (){
    long long int n;
    cin>>n;
    int count = 0;
    count = count_digits(n);
    int sum = n;
    if(count == 1)
        cout<<n<<endl;
    else{
    while (count != 1){
        sum = sum_digits(sum);
        count = count_digits(sum);
    }
    cout<<sum<<endl;}

    return 0;
}
