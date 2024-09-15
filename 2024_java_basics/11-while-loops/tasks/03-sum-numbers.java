import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = scanner.nextInt();
        int sum = 0;

        while (firstInput > sum) {
            int secondInput = scanner.nextInt();
            sum += secondInput;
        }

        System.out.println(sum);

        scanner.close();
    }
}
