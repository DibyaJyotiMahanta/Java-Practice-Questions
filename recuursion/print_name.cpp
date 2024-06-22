#include <bits/stdc++.h>
using namespace std;

void print_name(string name, int n, int i = 0)
{

    if (n == 0)
    {
        return;
    }

    cout << i << " " << name << endl;
    print_name(name, n - 1, i + 1);
}

int main()
{

    cout << "Enter the name you want to print: ";
    string name;
    cin >> name;
    cout << "How many times do you want to print it: ";
    int n;
    cin >> n;
    print_name(name, n);

    return 0;
}
