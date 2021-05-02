// link: https://codeforces.com/contest/1515/problem/A
#include<iostream>
using namespace std;

void solve(){
    // solve the challenge
    int n;  // number of gold pices
    long int x; // phoenix has to avoid
    cin>>n>>x;
    long int a[n];
    long int res, t;
    for(int i=0; i<n; i++){
        cin>>a[i];
    }
    // check
    if(n==1){
        if(a[0]==x) cout<<"NO";
        else cout<<"YES"<<endl<<a[0];
    }
    else{
        for(int i=0; i<n; i++){
            if(a[i]>x) cout<<"YES"<<endl;
            else{
                if(a[i]==x){
                    long int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    cout<<"YES"<<endl;
                }
                else{
                    res += a[i];
                    if(res == x && i+1!=n-1){
                        t=a[i];
                        res -= a[i];
                        res += a[i+1];
                    }
                    else{
                        cout<<"NO";
                    }
                    a[i] = res;
                }
            }
        }
        a[n-1]=t;
    }
}

int main(){
    int T;  // number of test cases
    cin>>T;
    while(T--){
        solve();
    }
    return 0;
}