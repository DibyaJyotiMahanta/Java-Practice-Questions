#include <bits/stdc++.h>

using namespace std;

int main()
{
    cout << "Enter the number ";
    int num;
    cin >> num;
    int divisor;
    vector<int> vec;

    for (int i = 1; i <= num; i++)
    {

        divisor = num % i;
        if (divisor == 0)
        {
            vec.push_back(i);
        }
    }
    int size = vec.size();
    if (size == 2)
        cout << num << " is a prime number";
    else
        cout << num << " is not a prime number";
    
}