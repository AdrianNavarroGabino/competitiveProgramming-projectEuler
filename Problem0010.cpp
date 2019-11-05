// Adrián Navarro Gabino

#include <iostream>

using namespace std;

bool isPrime(int n)
{
    int half = n / 2;
    
    for(int i = 2; i <= half; i++)
    {
        if(n % i == 0)
        {
            return false;
        }
    }
    
    return true;
}

int main()
{
    long long int result = 0;
    int prime = 2;
    
    while(prime < 2000000)
    {
        if(isPrime(prime))
        {
            cout << prime << endl;
            result += prime;
        }
        prime++;
    }
    
    cout << result << endl;
    
    return 0;
}

// 142913828922
