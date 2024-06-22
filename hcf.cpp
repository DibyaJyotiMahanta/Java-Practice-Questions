#include <bits/stdc++.h>
using namespace std;

int main(){
    int num1;
    cout<<"Enter the number 1 - ";
    cin>>num1;

    int num2;
    cout<<"Enter the number 2 - ";
    cin>>num2;

    int min;
    int flag = 0;

    if(num1<num2){
        min = num1;
    }
    else min =num2;

    for(int i =min; i >=1; i--){
        if(num1%min==0&&num2%min==0){
            flag=i;
            break;
        }
    }
    cout<<flag<<" is the HCF";
}