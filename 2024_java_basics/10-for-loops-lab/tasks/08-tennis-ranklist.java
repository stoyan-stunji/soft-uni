import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = scanner.nextInt();
        int points = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        int totalWinPoints = 0;
        int wins = 0;

        for (int tournament = 1; tournament <= tournaments; tournament++) {
            String stage = scanner.nextLine();
            switch (stage) {
                case "W":
                    points += 2000;
                    totalWinPoints += 2000;
                    wins += 1;
                    break;
                case "F":
                    points += 1200;
                    totalWinPoints += 1200;
                    break;
                case "SF":
                    points += 720;
                    totalWinPoints += 720;
                    break;
            }
        }

        System.out.println("Final points: " + points);

        double average = totalWinPoints * 1.0 / tournaments;
        System.out.println("Average points: " + Math.round(average));

        double wonToursPercent = (wins * 1.0 / tournaments) * 100;
        System.out.printf("%.2f%%%n", wonToursPercent);

        scanner.close();
    }
}
// 83/100
