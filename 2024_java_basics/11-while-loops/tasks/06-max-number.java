import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxN = Double.NEGATIVE_INFINITY; // Initialize to the smallest possible value
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            try {
                double number = Double.parseDouble(input);

                if (number > maxN) {
                    maxN = number;
                }

                input = scanner.nextLine();
            } catch (NumberFormatException e) {
                // Handle invalid input
                System.out.println("Invalid number format. Please enter a valid number.");
                input = scanner.nextLine();
            }
        }

        System.out.println(maxN);

        scanner.close();
    }
}
