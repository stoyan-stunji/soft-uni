import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        switch (ticket) {
            case "Premiere":
                income = r * c * 12.00;
                break;

            case "Normal":
                income = r * c * 7.50;
                break;

            case "Discount":
                income = r * c * 5.00;
                break;

            default:
                System.out.println("Invalid ticket type");
                scanner.close();
                return;
        }

        if (income > 0) {
            System.out.printf("%.2f leva\n", income);
        }

        scanner.close();
    }
}
