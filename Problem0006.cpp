// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int sum1;
    int sum2;
    sum1 = 0;
    sum2 = 0;
    
    for(int i = 1; i <= 100; i++)
    {
        sum1 = sum1 + (i*i);
        sum2 += i;
    }
    
    sum2 = sum2 * sum2;
    
    cout << sum2 - sum1 << endl;
    
    return 0;
}

// 1058313332
