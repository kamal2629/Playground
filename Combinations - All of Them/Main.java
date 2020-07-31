#include<iostream>
using namespace std;

void combination(int a[] , int n , int selected[] , int count){
    if(count == n){
        int i;
        for(i = 0 ; i < n ; i++){
            if(selected[i] == 1){
                cout<<a[i]<<",";
            }
        }
        cout<<endl;
        return;
    }

    selected[count] = 1;
    combination(a,n,selected,count + 1);
    selected[count] = 0;
    combination(a, n ,selected ,count+1);


}

int main(){
    int size;
    cin>>size;

    int arr[size];
    int selected[size];

    for(int i = 0; i <= size-1 ; i++){
        cin>>arr[i];
    }

    int visited_count = 0;
    combination(arr , size ,selected , visited_count);

    return 0;
}
