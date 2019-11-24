// Adrián Navarro Gabino

public class Problem0021
{
    public static int getSumOfProperDivisors(int n)
    {
        int result = 0;
        
        for(int i = 1; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                result += i;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args)
    {
        int result = 0;
        
        for(int i = 2; i < 10000; i++)
        {
            if(i == getSumOfProperDivisors(getSumOfProperDivisors(i)) &&
                getSumOfProperDivisors(i) != i)
            {
                result += getSumOfProperDivisors(i);
            }
        }
        
        System.out.println(result);
    }
}
