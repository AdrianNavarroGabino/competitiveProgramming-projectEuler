// Adrián Navarro Gabino

public class Problem0023
{
    public static boolean isAbundant(int n)
    {
        int result = 0;
        
        for(int i = 1; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                result += i;
                
                if(result > n)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static boolean sumOf2Abundant(int n)
    {
        for(int i = 12; i <= n / 2; i++)
        {
            if(isAbundant(i) && isAbundant(n - i))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args)
    {
        int result = 0;
        for(int i = 1; i <= 28123; i++)
        {
            if(!sumOf2Abundant(i))
            {
                result += i;
                System.out.println("result: " + result);
                System.out.println("i: " + i);
            }
        }
        
        System.out.println(result);
    }
}
