// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int meses[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // 1 Jan 1900 was a Monday
    int currentDay = 366 % 7;
    int count = 0;
    
    for(int i = 1901; i <= 2000; i++)
    {
        for(int j = 0; j < 12; j++)
        {
            currentDay += meses[j];
            
            if(j == 1 && i % 4 == 0)
            {
                currentDay++;
            }
            
            currentDay %= 7;
            
            if(currentDay % 7 == 0)
            {
                count++;
            }
        }
    }
    
    cout << count << endl;
    
    return 0;
}
