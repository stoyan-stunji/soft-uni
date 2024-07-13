import java.util.Scanner;

public class wsr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceMetres = Double.parseDouble(scanner.nextLine());
        double timeSecondsForMeter = Double.parseDouble(scanner.nextLine());

        double distanceToSwimInSeconds = distanceMetres * timeSecondsForMeter;
        double waterResistance = Math.floor(distanceMetres / 15);
        double addedTime = waterResistance * 12.5;

        double finalTime = distanceToSwimInSeconds + addedTime;

        if (finalTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.%n", finalTime);
        } else {
            double neededSeconds = finalTime - worldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.%n", neededSeconds);
        }

        scanner.close();
    }
}