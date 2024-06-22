#include<bits/stdc++.h>
using namespace std;
void star(int n){
     for(int i=0; i<n;i++){
        for(int j = 0; j<n; j++){
            cout<<"*"<<" ";
        }
        cout<<endl;
    }
}

void star1(int n){
    for(int i = 0; i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<"* "; 
        }
        cout<<endl;
    }
}

void star3(int n){
     for(int i = 0; i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<j+1; 
        }
        cout<<endl;
    }
}

void star4(int n){
     for(int i = 1; i<=n;i++){
        for(int j=1;j<=i;j++){
            cout<<i; 
        }
        cout<<endl;
    }
}

void star5(int n){
    for(int i = n; i>=0;i--){
        for(int j=i;j>=0;j--){
            cout<<"* "; 
        }
        cout<<endl;
    }
}

void star6(int n){
    for(int i = n; i>=1;i--){
        int a =1;
        for(int j=i;j>=1;j--){
            cout<<a; 
            a++;
        }
        cout<<endl;
    }
}

void star7(int n){
    for(int i = 0; i<n;i++){
        for(int j=0;j<n-i-1;j++){
            cout<<" ";
        }
        for(int k=0;k<2*i+1;k++){
            cout<<"*";
        }
        for(int j=0;j<n-i-1;j++){
            cout<<" ";
        }
        
        cout<<endl;
    }
}

// void star8(int n){
//     for(int i = n; i>0;i--){
//         for(int j=n-i-1;j>0;j--){
//             cout<<" ";
//         }
//         for(int k=2*n+1;k>0;k--){
//             cout<<"*";
//         }
//         for(int j=n-i-1;j>0;j--){
//             cout<<" ";
//         }
        
//         cout<<endl;
//     }
// }

void star8(int n){
    for(int i = 0; i<n;i++){
        for(int j=0;j<=i;j++){
            cout<<" ";
        }
        for(int k=0;k<2*n-2*i-1;k++){
            cout<<"*";
        }
        for(int j=0;j<=i;j++){
            cout<<" ";
        }
        
        cout<<endl;
    }
}

int main(){
    int n;
    cin>>n;
    star7(n);
    star8(n);
}