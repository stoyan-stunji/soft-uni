import java.util.Scanner;

public class bs
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        double a = Double.parseDouble(s.nextLine());
        double b = 0;
    
        if(a <= 100)
        {
            b = 5;
        }
        else if(a > 1000)
        {
            b = a * 0.1;
        }
        else
        {
            b = a * 0.2;
        }
        
        if(a % 2 == 0)
        {
            b = b + 1;
        }
        
        if(a % 10 == 5)
        {
            b = b + 2;
        }

        System.out.println(b);
        System.out.println(a + b);
        
        s.close();
    }
}