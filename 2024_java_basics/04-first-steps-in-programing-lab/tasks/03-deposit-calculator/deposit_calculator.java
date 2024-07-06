import java.util.Scanner;

public class deposit_calculator
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double deposit_sum = Double.parseDouble(s.nextLine());
        int limit = Integer.parseInt(s.nextLine());
        double percent = Double.parseDouble(s.nextLine());

        double percent_per_month = (deposit_sum * (percent / 100)) / 12;
        double full_sum = deposit_sum + limit * percent_per_month;

        System.out.println(full_sum);
        s.close();
    }
}