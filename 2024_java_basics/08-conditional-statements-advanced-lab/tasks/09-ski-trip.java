import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline character
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;
        double discount1 = 0.0;
        double discount2 = 0.0;
        double price = 0.0;
        double finalPrice = 0.0;

        switch (room) {
            case "room for one person":
                price = nights * 18.00;
                break;

            case "apartment":
                if (days <= 10) {
                    discount1 = 0.3;
                } else if (days > 10 && days <= 15) {
                    discount1 = 0.35;
                } else if (days > 15) {
                    discount1 = 0.5;
                }
                price = nights * 25.00;
                break;

            case "president apartment":
                if (days <= 10) {
                    discount1 = 0.1;
                } else if (days > 10 && days <= 15) {
                    discount1 = 0.15;
                } else if (days > 15) {
                    discount1 = 0.2;
                }
                price = nights * 35.00;
                break;
        }

        double priceAfterDiscount1 = price - (price * discount1);

        switch (rating) {
            case "positive":
                discount2 = 0.25;
                finalPrice = priceAfterDiscount1 + (priceAfterDiscount1 * discount2);
                break;

            case "negative":
                discount2 = 0.1;
                finalPrice = priceAfterDiscount1 - (priceAfterDiscount1 * discount2);
                break;
        }

        System.out.printf("%.2f%n", finalPrice);

        scanner.close();
    }
}
