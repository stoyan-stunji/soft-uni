import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the space
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int homeSpace = width * length * height;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int box = Integer.parseInt(input);
            homeSpace -= box;

            if (homeSpace <= 0) {
                int diff = Math.abs(homeSpace);
                System.out.println("No more free space! You need " + diff + " Cubic meters more.");
                break;
            }

            input = scanner.nextLine();
        }

        if (homeSpace > 0) {
            System.out.println(homeSpace + " Cubic meters left.");
        }

        scanner.close();
    }
}
