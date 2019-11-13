// Adrián Navarro Gabino

#include <iostream>

using namespace std;

double fact(int n)
{
    double fact;
    fact = 1;
    
    for(int i = 2; i <= n; i++)
    {
        fact *= i;
    }
    
    return fact;
}

double getPaths(int n)
{
    double aux1;
    double aux2;
    double result;
    
    aux1 = fact(2*n);
    aux2 = fact(n) * fact(n);
    result = aux1 / aux2;
    
    return result;
}

int main()
{
    cout.precision(12);
    cout << getPaths(20) << endl;
    
    return 0;
}
