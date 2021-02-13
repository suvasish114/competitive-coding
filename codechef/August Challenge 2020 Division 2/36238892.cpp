#include<iostream>
using namespace std;
int main(){
    int T;  //number of test cases
    cin>>T;
    int A;  //drath's helth
    int B;  //chef's attacking power
    int C[T];   //result
    for(int i=0; i<T; i++){
        cin>>A>>B;
        while(A!=0 && B!=0){
            A=A-B;
            B=B/2;
        }
        if(A>B){
            C[i]=0;
        }
        else{
            C[i]=1;
        }
    }
    for(int i=0; i<T; i++){
        cout<<C[i]<<endl;
    }
    return 0;
}