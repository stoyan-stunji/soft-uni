import java.util.Locale;
import java.util.Scanner;

public class gvk
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        double b = Double.parseDouble(s.nextLine());
        int ss = Integer.parseInt(s.nextLine());
        double o = Double.parseDouble(s.nextLine());
        double d = b * 0.10;

        double o_price = o * ss;

        if(ss > 150)
        {
            o_price = o_price - (o_price * 0.10);
        }

        double sum = o_price + d;
        double left = b - sum;

        if(left < 0)
        {
            left = -left;
            System.out.printf(Locale.US, "Not enough money!\nWingard needs %.2f leva more.", left);
        }
        else
        {
            System.out.printf(Locale.US, "Action!\nWingard starts filming with %.2f leva left.", left);
        }


        s.close();
    }
}