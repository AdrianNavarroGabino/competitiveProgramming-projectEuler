// Adrián Navarro Gabino

import java.util.*;

public class Problem0012
{
    public static int getDivisorsSize(int n)
    {
        int size = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                size++;
            }
        }
        
        return size;
    }
    
    public static void main(String[] args)
    {
        int number = 1;
        int size = 0;
        int triangle = 0;
        
        do
        {
            triangle += number;
            size = getDivisorsSize(triangle);
            number++;
        } while(size <= 500);
        
        System.out.println(triangle);
    }
}
