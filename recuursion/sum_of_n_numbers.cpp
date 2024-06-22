#include <bits/stdc++.h>
using namespace std;

int linear(int n, int sum=0)
{
    if (n == 0)
    {
        cout<<sum;
        return 0;
    }
    // cout << sum << " " << endl;

    linear(n - 1, sum+n);
    return 0;
}

int main()
{
    cout << "How many numbers do you want to print: ";
    int n;
    cin >> n;
    linear(n);

    return 0;
}
