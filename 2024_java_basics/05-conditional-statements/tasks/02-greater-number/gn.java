import java.util.Scanner;

public class gn
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());

        if(a > b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }

        s.close();
    }
}