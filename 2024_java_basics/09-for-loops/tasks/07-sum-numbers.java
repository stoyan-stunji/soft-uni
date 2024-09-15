import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            int number = scanner.nextInt();
            sum += number;
        }
        
        System.out.println(sum);
        
        scanner.close();
    }
}
