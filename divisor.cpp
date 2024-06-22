#include<bits/stdc++.h>

using namespace std;

int main(){
    cout<<"Enter the number ";\
    int num;
    cin>>num;
    int divisor;

    for(int i=1; i<=num/2;i++){
        
        divisor=num%i;
        if(divisor==0){
            cout<<i<<" ";
            
        }
    }
    cout<<num;
}