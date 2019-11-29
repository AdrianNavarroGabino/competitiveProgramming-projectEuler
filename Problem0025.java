// Adrián Navarro Gabino

import java.math.BigInteger;
import java.util.*;

public class Problem0025
{
    public static void main(String[] args)
    {
        ArrayList<BigInteger> fibo = new ArrayList<BigInteger>();
        
        fibo.add(BigInteger.valueOf(0));
        fibo.add(BigInteger.valueOf(1));
        
        while(!(fibo.get(fibo.size() - 1).divide((new BigInteger("10")).pow((new Integer("999")))))
            .equals(new BigInteger("1")))
        {
            fibo.add(fibo.get(fibo.size() - 1).add(fibo.get(fibo.size() - 2)));
        }
        
        System.out.println(fibo.size() - 1);
        System.out.println(fibo.get(fibo.size() - 1));
    }
}
