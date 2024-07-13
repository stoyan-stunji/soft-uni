import java.util.Scanner;

public class ss
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());
        int c = Integer.parseInt(s.nextLine());

        int sum = a + b + c;
        int min = sum / 60;
        int sec = sum % 60;

        if(sec < 10)
        {
            System.out.println(min + ":0" + sec);
        }
        else
        {
            System.out.println(min + ":" + sec);
        }

        s.close();
    }
}