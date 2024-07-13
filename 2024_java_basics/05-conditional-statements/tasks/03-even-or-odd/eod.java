import java.util.Scanner;

public class eod
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.nextLine());

        if(a % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }

        s.close();
    }
}