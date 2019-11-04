// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int num;
    num = 3;
    
    for(int i = 5; i < 1000; i++)
    {
        if(i % 3 == 0 || i % 5 == 0)
        {
            num += i;
        }
    }
    
    cout << num << endl;
    
    return 0;
}
