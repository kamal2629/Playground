#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;

    int input[n];
    for(int i=0;i<n;i++){
        cin>>input[i];
    }

    int min_index =0,max_index=0;
    int min_elem = input[0],max_elem = input[0];
    // loop to find min and max index
    for(int i=1;i<n;i++){
        if(input[i] < min_elem){
            min_elem = input[i];
            min_index = i;
        }
        if(max_elem < input[i]){
            max_elem = input[i];
            max_index = i;
        }
    }

    // if index of min > max
    int ans = 0;
    if(min_index > max_index){
        ans = (n - min_index -1) + max_index;
    }
    else
    {
        // if max_index > min_index
        ans =((n - min_index -1) + max_index )-1;

    }

    cout<<ans<<endl;
    return 0;


}