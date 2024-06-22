#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a;
    cout << "insert yout number ";
    cin >> a;
    int a1=a;
    int digit;
    int num=0;
    while (a1 > 0)
    {
        digit = a1 % 10;
        a1 = (int)a1 / 10;
        num = num*10 + digit;
    }
     if(num==a){
            cout<<a<<" is a palidrome number";
        }
        else {cout<<a<<" is not a palindrome number";}
}