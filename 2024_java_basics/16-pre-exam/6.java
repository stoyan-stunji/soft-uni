import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int validChanges = 0;

        for (int firstDigit1 = K; firstDigit1 <= 8; firstDigit1++) {
            for (int secondDigit1 = 9; secondDigit1 >= L; secondDigit1--) {
                for (int firstDigit2 = M; firstDigit2 <= 8; firstDigit2++) {
                    for (int secondDigit2 = 9; secondDigit2 >= N; secondDigit2--) {

                        if (firstDigit1 % 2 == 0 && secondDigit1 % 2 != 0
                                && firstDigit2 % 2 == 0 && secondDigit2 % 2 != 0) {

                            String number1 = "" + firstDigit1 + secondDigit1;
                            String number2 = "" + firstDigit2 + secondDigit2;

                            if (number1.equals(number2)) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("%s - %s%n", number1, number2);
                                validChanges++;
                            }
                            
                            if (validChanges == 6) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
