// Adrián Navarro Gabino

public class Problem0017
{
    public static void main(String[] args)
    {
        int[] units = {0, 3, 3, 5, 4, 4,
                                3, 5, 5, 4, 3,
                                6, 6, 8, 8, 7};
        int[] tens = {0, 4, 6, 6, 5, 5,
                            5, 7, 6, 6, 10};
        
        long result = 0;
        
        for(int i = 1; i <= 1000; i++)
        {
            if(i <= 15)
            {
                result += units[i];
            }
            else
            {
                if(i < 100)
                {
                    result += tens[i / 10];
                    result += units[i % 10];
                    if(i == 18)
                    {
                        result--;
                    }
                }
                else
                {
                    if(i % 1000 == 0)
                    {
                        result += (units[i / 1000] + 8);
                    }
                    else if(i % 100 == 0)
                    {
                        result += (units[i / 100] + 7);
                    }
                    else
                    {
                        result += units[i / 100];
                        result += tens[10];
                    }
                    
                    
                    if(i % 100 <= 15)
                    {
                        result += units[i % 100];
                    }
                    else
                    {
                        result += tens[(i % 100) / 10];
                        result += units[i % 10];
                        
                        if(i % 100 == 18)
                        {
                            result--;
                        }
                    }
                }
            }
        }
        
        System.out.println(result);
    }
}
