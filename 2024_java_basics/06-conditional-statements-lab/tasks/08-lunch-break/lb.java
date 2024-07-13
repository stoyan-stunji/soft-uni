import java.util.Scanner;

public class lb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        int timeOfMovie = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());

        double timeForLunch = lunchBreak * 0.125;
        double timeForRest = lunchBreak * 0.25;
        double allNeededTime = timeOfMovie + timeForLunch + timeForRest;

        double difference = Math.abs(lunchBreak - allNeededTime);

        if (lunchBreak - allNeededTime >= 0) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.%n", nameOfMovie, Math.ceil(difference));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.%n", nameOfMovie, Math.ceil(difference));
        }

        scanner.close();
    }
}