import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;

        while (steps < 10000) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int stepsHome = Integer.parseInt(scanner.nextLine());
                steps += stepsHome;
                break;
            } else {
                steps += Integer.parseInt(input);
            }
        }

        if (steps >= 10000) {
            int diff = steps - 10000;
            System.out.println("Goal reached! Good job!");
            System.out.println(diff + " steps over the goal!");
        } else {
            int diff = 10000 - steps;
            System.out.println(diff + " more steps to reach goal.");
        }

        scanner.close();
    }
}
