import java.util.Scanner;
import java.text.DecimalFormat;

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

        // Print maxN without .0 if it's an integer
        if (maxN == (int) maxN) {
            System.out.println((int) maxN);
        } else {
            DecimalFormat df = new DecimalFormat("#.##"); // Format to remove unnecessary decimal places
            System.out.println(df.format(maxN));
        }

        scanner.close();
    }
}
