// link: https://www.codechef.com/problems/FCTRL2

#include<iostream>
using namespace std;

int _fact(int num){
    int res=1;
    while(num>0){
        res *= num;
        num--;
    }
    return res;
}

void solve(){
    int n;
    cin>>n;
    cout<<_fact(n)<<endl;
}

int main(){
    int t;  // taste cases
    cin>>t;
    while(t--){
        solve();
    }
    return 0;
}
