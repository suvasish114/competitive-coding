#include<iostream>
using namespace std;
int main(){
    int T;  //number of test cases
    cin>>T;
    int C;
    int R;
    int Result[T][2];
    for(int i=0; i<T; i++){
        int SumC=0;
        int SumR=0;
        cin>>C>>R;
        if(C>9){
            if(C%9)SumC=1;
            SumC=SumC+(C/9);
        }
        else{
            SumC=1;
        }
        if(R>9){
            if(R%9)SumR=1;
            SumR=SumR+(R/9);
        }
        else{
            SumR=1;
        }
        
        if(SumC==SumR){
            Result[i][0]=1;
            Result[i][1]=SumC;
        }
        else if(SumC>SumR){ //rick wins
            Result[i][0]=1;
            Result[i][1]=SumR;
        }
        else{   //chef wins
            Result[i][0]=0;
            Result[i][1]=SumC;
        }
    }
    for(int i=0; i<T; i++){
        cout<<Result[i][0]<<" "<<Result[i][1]<<endl;
    }
    return 0;
}