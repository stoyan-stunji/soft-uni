import java.util.Scanner;

public class ss
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int num_of_pens = Integer.parseInt(s.nextLine());
        int num_of_marks = Integer.parseInt(s.nextLine());
        int litres = Integer.parseInt(s.nextLine());
        int percent = Integer.parseInt(s.nextLine());

        double price_pens = num_of_pens * 5.80;
        double price_marks = num_of_marks * 7.20;
        double price_litres = litres * 1.20;

        double sum = price_litres + price_marks + price_pens;
        double final_sum = sum - (sum * percent / 100);

        System.out.println(final_sum);

        s.close();
    }
}