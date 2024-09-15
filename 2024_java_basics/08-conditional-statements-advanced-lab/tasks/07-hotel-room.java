import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;

                if (nights > 7 && nights <= 14) {
                    priceStudio *= 0.95;
                } else if (nights > 14) {
                    priceStudio *= 0.70;
                    priceApartment *= 0.90;
                }
                break;

            case "June":
            case "September":
                priceStudio = 75.20;
                priceApartment = 68.70;

                if (nights > 14) {
                    priceStudio *= 0.80;
                    priceApartment *= 0.90;
                }
                break;

            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;

                if (nights > 14) {
                    priceApartment *= 0.90;
                }
                break;
        }

        double finalPriceApartment = priceApartment * nights;
        double finalPriceStudio = priceStudio * nights;
        
        System.out.printf("Apartment: %.2f lv.%n", finalPriceApartment);
        System.out.printf("Studio: %.2f lv.%n", finalPriceStudio);

        scanner.close();
    }
}
