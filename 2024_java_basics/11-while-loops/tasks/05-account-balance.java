import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double total = 0.0;

        while (!input.equals("NoMoreMoney")) {
            try {
                double amount = Double.parseDouble(input);

                if (amount < 0) {
                    System.out.println("Invalid operation!");
                    break;
                }

                System.out.printf("Increase: %.2f%n", amount);
                total += amount;

                input = scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format!");
                input = scanner.nextLine();
            }
        }

        System.out.printf("Total: %.2f%n", total);

        scanner.close();
    }
}
