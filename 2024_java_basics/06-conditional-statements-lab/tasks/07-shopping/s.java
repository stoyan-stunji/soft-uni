import java.util.Scanner;

public class s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberVideoCard = Integer.parseInt(scanner.nextLine());
        int numberProcessor = Integer.parseInt(scanner.nextLine());
        int numberRAM = Integer.parseInt(scanner.nextLine());

        double finalPriceVideoCard = numberVideoCard * 250;

        double priceProcessor = finalPriceVideoCard * 0.35;
        double finalPriceProcessor = numberProcessor * priceProcessor;

        double priceRAM = finalPriceVideoCard * 0.1;
        double finalPriceRAM = numberRAM * priceRAM;

        double finalPrice = finalPriceVideoCard + finalPriceProcessor + finalPriceRAM;

        if (numberVideoCard > numberProcessor) {
            finalPrice *= 0.85;
        }

        if (budget >= finalPrice) {
            double moneyLeft = budget - finalPrice;
            System.out.printf("You have %.2f leva left!%n", moneyLeft);
        } else {
            double moneyNeeded = finalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!%n", moneyNeeded);
        }

        scanner.close();
    }
}