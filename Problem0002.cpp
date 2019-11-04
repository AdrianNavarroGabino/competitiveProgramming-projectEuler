// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int fibo(int n)
{
    if(n < 1)
    {
        return 1;
    }
    
    return fibo(n - 1) + fibo(n - 2);
}

int main()
{
    int num = 0;
    int i;
    int fiboAux;
    i = 1;
    
    do
    {
        fiboAux = fibo(i);
        
        if(fiboAux % 2 == 0)
        {
            num += fiboAux;
        }
        
        i++;
    } while(fiboAux <= 4000000);
    
    cout << num << endl;
    
    return 0;
}
