#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a;
    cout << "insert yout number ";
    cin >> a;
    int a1=a;
    int digit;
    int digit1;
    int num=0;
    while (a1 > 0)
    {
        digit = a1 % 10;
        a1 = (int)a1 / 10;

        digit1=digit*digit*digit;
        num = num + digit1;
    }
    if(num==a){
        cout<<a<<" is an armstrong number";
    }
    else cout<<a<<" is not an armstrong number";
}