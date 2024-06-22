#include <bits/stdc++.h>
using namespace std;

void reverse(int n[], int count, int i = 0)
{
    if (i >= count)
    {
        return;
    }

    reverse(n, count, i + 1);
    cout << n[i] << " ";
}

int main()
{
    int n;
    cout << "Enter the size of the array? ";
    cin >> n;

    int a[n];

    cout << "Enter " << n << " elements: ";         
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    cout << "Reversed array: ";
    reverse(a, n);

    return 0;
}
