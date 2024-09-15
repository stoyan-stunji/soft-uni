import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());

        double discount = 0.0;
        double discount2 = 0.0;
        double priceShip = 0;

        switch (season) {
            case "Spring":
                priceShip = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceShip = 4200;
                break;
            case "Winter":
                priceShip = 2600;
                break;
        }

        if (fishers <= 6) {
            discount = 0.10;
        } else if (fishers <= 11) {
            discount = 0.15;
        } else if (fishers > 12) {
            discount = 0.25;
        }

        double priceDiscount1 = priceShip - (priceShip * discount);

        if (fishers % 2 == 0) {
            if (season.equals("Summer") || season.equals("Spring") || season.equals("Winter")) {
                discount2 = 0.05;
            } else if (season.equals("Autumn")) {
                discount2 = 0.0;
            }
        }

        double priceDiscount2 = priceDiscount1 - (priceDiscount1 * discount2);

        if (budget >= priceDiscount2) {
            double moneyLeft = budget - priceDiscount2;
            System.out.printf("Yes! You have %.2f leva left.%n", moneyLeft);
        } else {
            double moneyNeeded = priceDiscount2 - budget;
            System.out.printf("Not enough money! You need %.2f leva.%n", moneyNeeded);
        }

        scanner.close();
    }
}
