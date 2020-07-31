#include<bits/stdc++.h>
using namespace std;
string helper(int startindex,string s,int lastindex){
if(startindex>lastindex){
return "";
}
if(startindex==lastindex){
string p="";
p= p+s[startindex];
return p;
}
unordered_map<char,int> m;
for(int i=startindex;i<=lastindex;i++){
m[s[i]]=i;
}
int c= m[s[startindex]];
string a="";
if(c>startindex){
a= helper(startindex+1,s,c-1);
a= s[startindex]+a+s[startindex];
}
string b= helper(startindex+1,s,lastindex);

if(a.length()>b.length()){
return a;
}
else{
return b;
}
}
string palindrome(int n,string s){
return helper(0,s,n-1);
}
int main(){
string s;
cin>>s;
int n= s.length();

string x=palindrome(n,s);
if(x.length()<=1){
cout<<-1<<endl;
}
else{
cout<<x<<endl;
}
}