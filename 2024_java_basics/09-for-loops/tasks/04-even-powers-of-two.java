import java.util.Scanner;

public class NumbersN1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;

        for (int value = 0; value <= n; value += 2) {
            System.out.println(num);
            num = num * 2 * 2;
        }
        
        scanner.close();
    }
}
