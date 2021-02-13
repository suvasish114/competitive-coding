// link: https://www.codechef.com/FEB21C/problems/HDIVISR
// contest code: https://www.codechef.com/FEB21C?order=desc&sortBy=successful_submissions
#include<iostream>
int main(){
    int N;
    int res=0;
    std::cin>>N;
    for(int i=1; i<=10; i++){
        if(N%i == 0){
            res = i;
        }
    }
    std::cout<<res;
    return 0;
}