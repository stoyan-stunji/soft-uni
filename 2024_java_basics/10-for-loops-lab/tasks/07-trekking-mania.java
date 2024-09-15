import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGroups = scanner.nextInt();

        int musala = 0;
        int monblan = 0;
        int kilimanjaro = 0;
        int ktwo = 0;
        int everest = 0;

        for (int i = 1; i <= numberGroups; i++) {
            int people = scanner.nextInt();

            if (people <= 5) {
                musala += people;
            } else if (people >= 6 && people <= 12) {
                monblan += people;
            } else if (people >= 13 && people <= 25) {
                kilimanjaro += people;
            } else if (people >= 26 && people <= 40) {
                ktwo += people;
            } else if (people >= 41) {
                everest += people;
            }
        }

        int peopleAll = musala + monblan + kilimanjaro + ktwo + everest;

        double percentMusala = (musala * 100.0) / peopleAll;
        double percentMonblan = (monblan * 100.0) / peopleAll;
        double percentKilimanjaro = (kilimanjaro * 100.0) / peopleAll;
        double percentKtwo = (ktwo * 100.0) / peopleAll;
        double percentEverest = (everest * 100.0) / peopleAll;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentKtwo);
        System.out.printf("%.2f%%%n", percentEverest);

        scanner.close();
    }
}
