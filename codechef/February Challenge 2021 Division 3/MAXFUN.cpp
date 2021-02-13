// link: https://www.codechef.com/FEB21C/problems/HDIVISR
// contest code: https://www.codechef.com/FEB21C?order=desc&sortBy=successful_submissions
#include<iostream>
void bubble_sort(int *a, unsigned long int size_a);
int main(){
    int result=0;
    int T;  //number of test cases. 1≤T≤5
    unsigned long int N;    //3≤N≤10^5
    std::cin>>T;
    while(T--){
        std::cin>>N;
        int A[N];   // N space separeted integers. |Ai|≤10^9  for each valid i
        for(unsigned long int i=0; i<N; i++){
            std::cin>>A[i];
        }
        bubble_sort(A,N);
        for(unsigned long int i=0; i<N; i++){
            std::cout<<A[i]<<" ";
        }
        int x = A[0];
        int y;
        int z = A[N-1];
        if (N%2 == 0){
            y = A[N/2];
        }
        else{
            y = A[(N/2)+1];
        }

        result = abs(x-y)+abs(y-z)+abs(z-x);
        std::cout<<std::endl<<result;
    }
    return 0;
}
void bubble_sort(int *a, unsigned long int size_a){
    for(unsigned long int i=0; i< size_a; i++){
        for(unsigned long int j=0; j< size_a-1; j++){
            if(a[j]>a[j+1]){
                int temp;
                temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}