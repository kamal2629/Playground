#include<iostream>
#include<vector>
using namespace std;

int main(){
    long long int n;
    cin>>n;
    vector< int>a;
    int temp =0;

    for(int i = 1 ; i*i <= n ; i++){
        if(n % i ==0){
            a.push_back(i);
            if ( i != n/i)
                a.push_back(n/i);

        }
    }

    for(int i = 0 ; i < a.size() ; i++){
        for(int k = i+1 ; k < a.size() ; k++){
            if( a.at(i) >= a.at(k)){
                temp = a.at(k);
                a.at(k) = a.at(i);
                a.at(i) = temp;
            }
        }
    }
    for(int i =0 ; i< a.size() ; i++){
        cout<<a.at(i)<<" ";
    }
    cout<<endl;
    return 0;
}
