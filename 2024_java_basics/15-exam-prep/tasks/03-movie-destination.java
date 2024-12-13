
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (season.equals("Summer"))
        {
            if (destination.equals("Dubai"))
            {
                price = 40000.0;
            }
            else if (destination.equals("Sofia"))
            {
                price = 12500.0;
            }
            else if (destination.equals("London"))
            {
                price = 20250.0;
            }
        }
        else if (season.equals("Winter"))
        {
            if (destination.equals("Dubai"))
            {
                price = 45000.0;
            }
            else if (destination.equals("Sofia"))
            {
                price = 17000.0;
            }
            else if (destination.equals("London"))
            {
                price = 24000.0;
            }
        }

        double sum = days * price;

        if (destination.equals("Dubai"))
        {
            sum = sum - (sum * 0.30);
        }
        else if (destination.equals("Sofia"))
        {
            sum = sum + (sum * 0.25);
        }

        double diff = budget - sum;

        if (diff >= 0)
        {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", diff);
        }
        else {
            System.out.printf("The director needs %.2f leva more!", -diff);
        }

    }
}
