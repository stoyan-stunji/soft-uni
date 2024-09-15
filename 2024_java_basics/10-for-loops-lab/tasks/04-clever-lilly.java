import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        double priceWashMachine = scanner.nextDouble();
        int presentPrice = scanner.nextInt();

        double moneyBirthday = 0.0;
        double savedMoney = 0.0;
        int numberOfToys = 0;

        for (int currentYear = 1; currentYear <= age; currentYear++) {
            if (currentYear % 2 != 0) {
                numberOfToys++;
            } else {
                moneyBirthday += 10;
                savedMoney += (moneyBirthday - 1);
            }
        }

        savedMoney += numberOfToys * presentPrice;

        if (savedMoney >= priceWashMachine) {
            double money = savedMoney - priceWashMachine;
            System.out.printf("Yes! %.2f%n", money);
        } else {
            double money = priceWashMachine - savedMoney;
            System.out.printf("No! %.2f%n", money);
        }
        
        scanner.close();
    }
}
