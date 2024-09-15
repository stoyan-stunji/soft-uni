import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumPrime = 0;
        int sumNotPrime = 0;
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }

            int n = Integer.parseInt(input);

            if (n < 0) {
                System.out.println("Number is negative.");
                continue;
            }

            if (n == 0) {
                continue;
            }

            boolean isPrime = true;
            
            if (n == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                sumPrime += n;
            } else {
                sumNotPrime += n;
            }
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNotPrime);
        
        scanner.close();
    }
}
