import java.util.Scanner;

public class rp
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int naylon = Integer.parseInt(s.nextLine());
        int paint = Integer.parseInt(s.nextLine());
        int defuser = Integer.parseInt(s.nextLine());
        int hours = Integer.parseInt(s.nextLine());

        double price_naylon = (naylon + 2) * 1.50;
        double price_paint = (paint + (paint * 0.10)) * 14.50;
        double price_defuser = defuser * 5.00; 
        
        double sum = price_defuser + price_paint + price_naylon + 0.40;
        double other_sum = (sum * 0.30) * hours;
        double final_sum = sum + other_sum;

        System.out.println(final_sum);

        s.close();
    }
}