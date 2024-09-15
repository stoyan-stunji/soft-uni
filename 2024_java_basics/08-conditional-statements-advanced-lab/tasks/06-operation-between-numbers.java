import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();

        double result;
        double check;

        switch (operation) {
            case "+":
                result = n1 + n2;
                check = result % 2;
                if (check == 0) {
                    System.out.printf("%.0f + %.0f = %.0f - even%n", n1, n2, result);
                } else {
                    System.out.printf("%.0f + %.0f = %.0f - odd%n", n1, n2, result);
                }
                break;

            case "-":
                result = n1 - n2;
                check = result % 2;
                if (check == 0) {
                    System.out.printf("%.0f - %.0f = %.0f - even%n", n1, n2, result);
                } else {
                    System.out.printf("%.0f - %.0f = %.0f - odd%n", n1, n2, result);
                }
                break;

            case "*":
                result = n1 * n2;
                check = result % 2;
                if (check == 0) {
                    System.out.printf("%.0f * %.0f = %.0f - even%n", n1, n2, result);
                } else {
                    System.out.printf("%.0f * %.0f = %.0f - odd%n", n1, n2, result);
                }
                break;

            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero%n", n1);
                } else {
                    result = n1 / n2;
                    System.out.printf("%.0f / %.0f = %.2f%n", n1, n2, result);
                }
                break;

            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero%n", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%.0f %% %.0f = %.0f%n", n1, n2, result);
                }
                break;
        }

        scanner.close();
    }
}
