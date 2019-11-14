// Adrián Navarro Gabino

import java.math.BigInteger; 

public class Problem0016
{
    public static void main(String[] args)
    {
        BigInteger a = BigInteger.valueOf(1);
    
        for(int i = 1; i <= 1000; i++)
        {
            a = a.multiply(BigInteger.valueOf(2));
        }
        
        String b = a.toString();
        
        BigInteger result = BigInteger.valueOf(0);
        
        for(int i = 0; i < b.length(); i++)
        {
            result = result.add(
                BigInteger.valueOf(Character.getNumericValue(b.charAt(i))));
        }
        
        System.out.println(result);
    }
}
