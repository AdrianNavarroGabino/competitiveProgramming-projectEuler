// Adrián Navarro Gabino

public class Problem0004
{
    public static boolean isPalindrome(int num)
    {
        String aux = num + "";
        String aux2 = "";
        
        for(int i = aux.length() - 1; i >= 0; i--)
        {
            aux2 += aux.charAt(i);
        }
        
        return aux.equals(aux2);
    }
    
    public static int getLargestPalindrome()
    {
        int maxPalindrome = 0;
        
        for(int i = 999; i >= 100; i--)
        {
            for(int j = 999; j >= 100; j--)
            {
                if(isPalindrome(i * j) && (i * j) > maxPalindrome)
                {
                    maxPalindrome = i * j;
                }
            }
        }
        return maxPalindrome;
    }
    
    public static void main(String[] args)
    {
        System.out.println(getLargestPalindrome());
    }
}
