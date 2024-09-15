import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        
        for (int i = n1; i <= n2; i++) {
            String number = Integer.toString(i);
            int evenSum = 0;
            int oddSum = 0;
            
            for (int j = 0; j < number.length(); j++) {
                int digit = Character.getNumericValue(number.charAt(j));
                
                if (j % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
}
