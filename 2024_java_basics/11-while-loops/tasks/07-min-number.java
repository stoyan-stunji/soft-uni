import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double minN = Double.POSITIVE_INFINITY; // Initialize to the largest possible value
        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            try {
                double number = Double.parseDouble(input);

                if (number < minN) {
                    minN = number;
                }

                input = scanner.nextLine();
            } catch (NumberFormatException e) {
                // Handle invalid number format
                System.out.println("Invalid number format. Please enter a valid number.");
                input = scanner.nextLine();
            }
        }

        // Output the minimum number after the loop ends
        System.out.println(minN);

        scanner.close();
    }
}
