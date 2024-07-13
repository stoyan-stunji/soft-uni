import java.util.Scanner;

public class ts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrize = Double.parseDouble(scanner.nextLine());
        int puzzleNumber = Integer.parseInt(scanner.nextLine());
        int puppetNumber = Integer.parseInt(scanner.nextLine());
        int bearNumber = Integer.parseInt(scanner.nextLine());
        int minionNumber = Integer.parseInt(scanner.nextLine());
        int truckNumber = Integer.parseInt(scanner.nextLine());

        double prizeToys = 2.6 * puzzleNumber + 3 * puppetNumber + 4.1 * bearNumber + 8.2 * minionNumber + 2 * truckNumber;
        int numberToys = puzzleNumber + puppetNumber + bearNumber + minionNumber + truckNumber;

        if (numberToys >= 50) {
            double discount = prizeToys * 0.25;
            prizeToys -= discount;
        }

        double rent = prizeToys * 0.1;
        double finalIncome = prizeToys - rent;

        if (finalIncome >= excursionPrize) {
            double moneyLeft = finalIncome - excursionPrize;
            System.out.printf("Yes! %.2f lv left.%n", moneyLeft);
        } else {
            double moneyNeeded = excursionPrize - finalIncome;
            System.out.printf("Not enough money! %.2f lv needed.%n", moneyNeeded);
        }

        scanner.close();
    }
}