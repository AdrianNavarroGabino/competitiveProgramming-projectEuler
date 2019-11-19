// Adrián Navarro Gabino

#include <iostream>

using namespace std;

int sumDigits(string n)
{
    int result;
    result = 0;
    int length = n.length();
    
    for(int i = 0; i < length; i++)
    {
        result += (stoi(to_string(n[i])) - 48);
    }
    
    return result;
}

int main()
{
    cout << sumDigits("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000") << endl;
    
    return 0;
}
