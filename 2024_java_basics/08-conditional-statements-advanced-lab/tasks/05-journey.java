import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String rest = "";
        double savedMoney = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                savedMoney = budget * 0.3;
                rest = "Camp";
            } else if (season.equals("winter")) {
                savedMoney = budget * 0.7;
                rest = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                savedMoney = budget * 0.4;
                rest = "Camp";
            } else if (season.equals("winter")) {
                savedMoney = budget * 0.8;
                rest = "Hotel";
            }
        } else {
            destination = "Europe";
            savedMoney = budget * 0.9;
            rest = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", rest, savedMoney);

        scanner.close();
    }
}
