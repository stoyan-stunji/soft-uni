import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the trip price and total money
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double totalMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendDaysCounter = 0;

        while (totalMoney < tripPrice) {
            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            if (command.equals("spend")) {
                spendDaysCounter++;

                totalMoney -= currentMoney;

                if (totalMoney < 0) {
                    totalMoney = 0;
                }

                if (spendDaysCounter == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(daysCounter);
                    break;
                }
            } else if (command.equals("save")) {
                spendDaysCounter = 0;

                totalMoney += currentMoney;

                if (totalMoney >= tripPrice) {
                    System.out.println("You saved the money for " + daysCounter + " days.");
                    break;
                }
            }
        }

        scanner.close();
    }
}
