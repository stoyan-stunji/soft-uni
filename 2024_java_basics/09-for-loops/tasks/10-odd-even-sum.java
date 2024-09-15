import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= rows; i++) {
            int num = scanner.nextInt();
            if (i % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + evenSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(evenSum - oddSum));
        }
        
        scanner.close();
    }
}
