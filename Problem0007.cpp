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
    int i = 1;
    int prime = 2;
    
    while(i < 10001)
    {
        prime++;
        if(isPrime(prime))
        {
            i++;
        }
    }
    
    cout << prime << endl;
}
