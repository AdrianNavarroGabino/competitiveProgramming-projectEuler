// Adrián Navarro Gabino

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Problem0022
{
    public static void main(String[] args)
    {
        String filename = "names.txt";
        String[] names = null;

        if (! (new File(filename)).exists() ) {
            Scanner sc = new Scanner(System.in);
            System.out.println(filename + " not found");
            System.out.print("Enter filename: ");
            filename = sc.nextLine();
        }

        System.out.println("Reading file...");
        try {
            BufferedReader file = new BufferedReader(
                new FileReader(new File(filename)));
            String line = file.readLine();
            while (line != null) {
                names = line.toLowerCase().substring(1, line.length() - 1).split("\",\"");
                line = file.readLine();
            }
            file.close();
            System.out.println("End of reading");
        }
        catch (IOException errorDeFichero) {
            System.out.println(
                "There were problems: " +
                errorDeFichero.getMessage() );
        }
        
        long result = 0;
        
        Arrays.sort(names);
        
        for(int i = 0; i < names.length; i++)
        {
            long nameCount = 0;
            for(int j = 0; j < names[i].length(); j++)
            {
                nameCount += ((int)names[i].charAt(j) - 96);
            }
            
            result += (nameCount * (i + 1));
        }
        
        System.out.println(result);
    }
}
