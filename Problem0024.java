// Adrián Navarro Gabino

public class Problem0024
{
    static int index = 0;
    
    private static void Perm2(String[] elem, String act, int n, int r, int pos)
    {
        if (n == 0)
        {
            index++;
            if(index <= pos)
                System.out.println(index);
            if(index == pos)
            {
                System.out.println("This is the number: " + act);
                return;
            }
        }
        else
        {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i]))
                {
                    Perm2(elem, act + elem[i], n - 1, r, pos);
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        String[] numbers = "0,1,2,3,4,5,6,7,8,9".split(",");
        Perm2(numbers, "", 10, 10, 1000000);
    }
}
