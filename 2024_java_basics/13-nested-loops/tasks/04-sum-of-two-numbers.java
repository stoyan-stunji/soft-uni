import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        int check = 0;
        boolean isN3 = false;

        for (int i = n1; i <= n2; i++) {
            for (int j = n1; j <= n2; j++) {
                check++;
                
                if (i + j == n3) {
                    isN3 = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", check, i, j, n3);
                    break;
                }
            }
            
            if (isN3) {
                break;
            }
        }
        
        if (!isN3) {
            System.out.printf("%d combinations - neither equals %d%n", check, n3);
        }

        scanner.close();
    }
}
