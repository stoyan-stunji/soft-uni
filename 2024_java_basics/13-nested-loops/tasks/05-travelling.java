import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double budget = scanner.nextDouble();
            double savedMoney = scanner.nextDouble();
            scanner.nextLine(); // Consume the leftover newline character

            while (savedMoney < budget) {
                savedMoney += scanner.nextDouble();
                scanner.nextLine(); // Consume the leftover newline character
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }

        scanner.close();
    }
}
