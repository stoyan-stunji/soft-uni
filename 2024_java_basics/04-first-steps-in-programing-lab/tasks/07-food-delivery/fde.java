import java.util.Scanner;

public class fde
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int chicken = Integer.parseInt(s.nextLine());
        int fish = Integer.parseInt(s.nextLine());
        int vegetarian = Integer.parseInt(s.nextLine());

        double chicken_price = chicken * 10.35;
        double fish_price = fish * 12.40;
        double veg_price = vegetarian * 8.15;

        double sum = chicken_price + fish_price + veg_price;
        double desert = sum * 0.2;

        double final_price = sum + desert + 2.50;

        System.out.println(final_price);

        s.close();
    }
}