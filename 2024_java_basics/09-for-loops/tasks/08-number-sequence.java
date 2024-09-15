import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        int rows = scanner.nextInt();
        
        for (int i = 0; i < rows; i++) {
            int number = scanner.nextInt();
            if (number > maxNum) {
                maxNum = number;
            }
            if (number < minNum) {
                minNum = number;
            }
        }
        
        System.out.println("Max number: " + maxNum);
        System.out.println("Min number: " + minNum);
        
        scanner.close();
    }
}
