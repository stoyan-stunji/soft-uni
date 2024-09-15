import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double cake = length * width;
        double pieces = 0.0;

        while (cake > 0) {
            String input = scanner.nextLine();

            if (input.equals("STOP")) {
                break;
            }

            int takenPieces = Integer.parseInt(input);
            cake -= takenPieces;
        }

        if (cake >= 0) {
            System.out.printf("%.0f pieces are left.%n", cake);
        } else {
            System.out.printf("No more cake left! You need %.0f pieces more.%n", Math.abs(cake));
        }

        scanner.close();
    }
}
