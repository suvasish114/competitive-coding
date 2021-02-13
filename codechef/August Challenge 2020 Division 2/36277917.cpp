#include<iostream>
using namespace std;
int main(){
    int T;  //number of test cases
    cin>>T;
    int N;  //number of players
    int K;  //chef's square
    int A;
    int F[T];  //final
    for(int i=0; i<T; i++){
        int result=-1;
        cin>>N>>K;
        for(int j=0; j<N; j++){
            cin>>A;
            if(K%A==0){
                if(result<A){
                    result=A;
                }
            }
        }
        F[i]=result;
    }
    for(int i=0; i<T; i++){
        cout<<F[i]<<endl;
    }
    return 0;
}