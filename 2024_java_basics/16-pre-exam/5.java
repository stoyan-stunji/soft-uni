
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = 5364;
        final int target = 8848;
        int days = 1; 

        while (true) {
            String cmd = scanner.nextLine();

            if (cmd.equalsIgnoreCase("END")) {
                System.out.println("Failed!");
                System.out.println(start);
                break;
            }

            if (cmd.equalsIgnoreCase("Yes")) {
                days++;
                if (days > 5) {
                    System.out.println("Failed!");
                    System.out.println(start);
                    break;
                }
            }

            int metres = Integer.parseInt(scanner.nextLine());
            start += metres;

            if (start >= target) {
                System.out.printf("Goal reached for %d days!%n", days);
                break;
            }
        }

        scanner.close();
    }
}
