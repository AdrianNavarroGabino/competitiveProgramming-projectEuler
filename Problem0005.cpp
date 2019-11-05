// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int getSmallestMultiple()
{
    int number;
    number = 2520;
    
    for(int i = 1; i <= 20; i++)
    {
        if(number % i != 0)
        {
            number++;
            i = 1;
        }
    }
    return number;
}

int main()
{
    cout << getSmallestMultiple() << endl;
    
    return 0;
}
