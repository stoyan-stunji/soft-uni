import java.util.Scanner;

public class usd_to_bgn
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double usd = Double.parseDouble(s.nextLine());
        double bgn = usd * 1.7954;
        System.out.println(bgn);
        s.close();
    }
}