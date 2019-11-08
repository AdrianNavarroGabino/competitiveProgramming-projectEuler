// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int main()
{
    int size;
    int maxSizeStartingNumber;
    int maxSize;
    long long int currentTerm;
    maxSizeStartingNumber = 0;
    maxSize = 0;
    
    for(int i = 2; i < 1000000; i++)
    {
        cout << "i: " << i << endl;
        size = 1;
        currentTerm = i;
        
        while(currentTerm != 1)
        {
            if(currentTerm % 2 == 0)
            {
                currentTerm /= 2;
            }
            else
            {
                currentTerm = currentTerm * 3 + 1;
            }
            
            size++;
        }
        cout << "Size: " << size << endl;
        
        if(maxSize < size)
        {
            maxSize = size;
            maxSizeStartingNumber = i;
        }
    }
    
    cout << maxSizeStartingNumber << endl;
    
    return 0;
}

// 837799
