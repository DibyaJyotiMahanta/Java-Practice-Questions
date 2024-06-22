#include <bits/stdc++.h>
using namespace std;

void linear(int n)
{

    if (n == 0)
    {
        return;
    }
    linear(n - 1);
    cout << n << " " << endl;
    
}

int main()
{
    cout << "How many numbers do you want to print: ";
    int n;
    cin >> n;
    linear(n);

    return 0;
}
