import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double pointsAcademy = scanner.nextDouble();
        int numberOfJuries = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after nextInt()

        for (int i = 1; i <= numberOfJuries; i++) {
            String nameJury = scanner.nextLine();
            double pointsJury = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character after nextDouble()

            int nameJuryLength = nameJury.length();

            pointsAcademy += ((nameJuryLength * 1.0 * pointsJury) / 2);

            if (pointsAcademy >= 1250.5) {
                break;
            }
        }

        if (pointsAcademy >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n", nameActor, pointsAcademy);
        } else {
            double pointsNeeded = 1250.5 - pointsAcademy;
            System.out.printf("Sorry, %s you need %.1f more!%n", nameActor, pointsNeeded);
        }

        scanner.close();
    }
}
