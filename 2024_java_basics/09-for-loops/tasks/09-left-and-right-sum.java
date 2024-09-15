import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        int leftSum = 0;
        int rightSum = 0;

        // Read and process 2 * rows numbers
        for (int i = 0; i < 2 * rows; i++) {
            int number = scanner.nextInt();
            if (i < rows) {
                leftSum += number;
            } else {
                rightSum += number;
            }
        }

        // Compare sums and print results
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + Math.abs(leftSum - rightSum));
        }
        
        scanner.close();
    }
}
