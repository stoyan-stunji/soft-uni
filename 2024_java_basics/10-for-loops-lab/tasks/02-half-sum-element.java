import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            int num = scanner.nextInt();
            sum += num;

            if (num > max) {
                max = num;
            }
        }

        int sumNoMax = sum - max;

        if (max == sumNoMax) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        } else {
            int diff = Math.abs(max - sumNoMax);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
        
        scanner.close();
    }
}
