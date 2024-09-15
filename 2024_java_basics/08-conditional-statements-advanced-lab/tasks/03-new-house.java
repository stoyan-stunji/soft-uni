import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFlower = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;

        double finalPrice = 0.0;
        double finalPriceDiscount = 0.0;

        switch (typeOfFlower) {
            case "Roses":
                if (quantity > 80) {
                    finalPrice = quantity * priceRoses;
                    finalPriceDiscount = finalPrice - (finalPrice * 0.10);
                } else {
                    finalPriceDiscount = quantity * priceRoses;
                }
                break;
            case "Dahlias":
                if (quantity > 90) {
                    finalPrice = quantity * priceDahlias;
                    finalPriceDiscount = finalPrice - (finalPrice * 0.15);
                } else {
                    finalPriceDiscount = quantity * priceDahlias;
                }
                break;
            case "Tulips":
                if (quantity > 80) {
                    finalPrice = quantity * priceTulips;
                    finalPriceDiscount = finalPrice - (finalPrice * 0.15);
                } else {
                    finalPriceDiscount = quantity * priceTulips;
                }
                break;
            case "Narcissus":
                if (quantity < 120) {
                    finalPrice = quantity * priceNarcissus;
                    finalPriceDiscount = finalPrice + (finalPrice * 0.15);
                } else {
                    finalPriceDiscount = quantity * priceNarcissus;
                }
                break;
            case "Gladiolus":
                if (quantity < 80) {
                    finalPrice = quantity * priceGladiolus;
                    finalPriceDiscount = finalPrice + (finalPrice * 0.20);
                } else {
                    finalPriceDiscount = quantity * priceGladiolus;
                }
                break;
        }

        if (budget >= finalPriceDiscount) {
            double moneyLeft = budget - finalPriceDiscount;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.%n", quantity, typeOfFlower, moneyLeft);
        } else {
            double moneyNeeded = finalPriceDiscount - budget;
            System.out.printf("Not enough money, you need %.2f leva more.%n", moneyNeeded);
        }

        scanner.close();
    }
}
