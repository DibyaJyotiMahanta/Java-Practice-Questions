#include <bits/stdc++.h>
using namespace std;

void encode(long long n)
{
    string num = to_string(n);
    int len = num.length();

    if (len > 10)
    {
        cout << "Invalid number of digits";
        return;
    }

    if (len == 1)
    {
        cout << "A";
        if (n < 5)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 2)
    {
        cout << "B";
        if (n < 54)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 3)
    {
        cout << "C";
        if (n < 549)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 4)
    {
        cout << "D";
        if (n < 5499)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 5)
    {
        cout << "E";
        if (n < 54999)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 6)
    {
        cout << "F";
        if (n < 549999)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 7)
    {
        cout << "G";
        if (n < 5499999)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 8)
    {
        cout << "H";
        if (n < 54999999)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 9)
    {
        cout << "I";
        if (n < 549999999)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    else if (len == 10)
    {
        cout << "J";
        if (n < 5499999999)
        {
            cout << "L";
        }
        else
        {
            cout << "M";
        }
    }
    return;
}

int main()
{
    long long n;
    cout << "Enter a number up to 10 digits: ";
    cin >> n;
    encode(n);
    return 0;
}
