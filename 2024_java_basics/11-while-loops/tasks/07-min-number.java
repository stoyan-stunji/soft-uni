import java.util.Scanner;
import java.text.DecimalFormat;

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

        // Print minN without .0 if it's an integer
        if (minN == (int) minN) {
            System.out.println((int) minN);
        } else {
            DecimalFormat df = new DecimalFormat("#.##"); // Format to remove unnecessary decimal places
            System.out.println(df.format(minN));
        }

        scanner.close();
    }
}
