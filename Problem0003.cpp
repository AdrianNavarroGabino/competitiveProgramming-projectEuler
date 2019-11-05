// Adrián Navarro Gabino

#include <iostream>

using namespace std;

bool isPrime(long long int n)
{
    long long int half = n / 2;
    for(long long int i = 2; i <= half; i++)
    {
        if(n % i == 0)
        {
            return false;
        }
    }
    
    return true;
}

long long int findLargestFactor(long long int n)
{
    long long int maxFactor = 0;
    
    for(long long int i = 2; i <= n / 2; i++)
    {
        if(n % i == 0 && isPrime(i))
        {
            if(maxFactor < i)
            {
                maxFactor = i;
            }
            n /= i;
            i = 2;
        }
    }
    
    if(isPrime(n) && n > maxFactor)
    {
        maxFactor = n;
    }
    
    return maxFactor;
}

int main()
{
    cout << findLargestFactor(600851475143) << endl;
    
    return 0;
}
