#include <bits/stdc++.h>
using namespace std;

int count(int a){
string str = to_string(a);
int count = str.length();
return count;
}

int main()
{
   
    int a;
    cout<<"insert yout number ";
    cin>>a;
    vector<int>vec;
    int len = count(a);
    for(int i = 0; i<len; i++){
        int digit=a%10;
        vec.push_back(digit);
        a /= 10;

    }
     for (int value : vec) {
        cout << value << endl;
    }

}

