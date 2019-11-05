// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int getProduct()
{
    for(int a = 1; a < 998; a++)
    {
        for(int b = a + 1; b < 999; b++)
        {
            for(int c = b + 1; c < 1000; c++)
            {
                if(a * a + b * b == c * c && a + b + c == 1000)
                {
                    cout << a << endl;
                    cout << b << endl;
                    cout << c << endl;
                    return a * b * c;
                }
            }
        }
    }
    return -1;
}

int main()
{
    cout << getProduct() << endl;
    
    return 0;
}
