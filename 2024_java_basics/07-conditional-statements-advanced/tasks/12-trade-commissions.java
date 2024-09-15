import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;

        switch (town) {
            case "Sofia":
                if (s >= 0 && s <= 500) {
                    commission = s * 0.05;
                } else if (s > 500 && s <= 1000) {
                    commission = s * 0.07;
                } else if (s > 1000 && s <= 10000) {
                    commission = s * 0.08;
                } else if (s > 10000) {
                    commission = s * 0.12;
                } else {
                    System.out.println("error");
                    scanner.close();
                    return;
                }
                break;

            case "Varna":
                if (s >= 0 && s <= 500) {
                    commission = s * 0.045;
                } else if (s > 500 && s <= 1000) {
                    commission = s * 0.075;
                } else if (s > 1000 && s <= 10000) {
                    commission = s * 0.10;
                } else if (s > 10000) {
                    commission = s * 0.13;
                } else {
                    System.out.println("error");
                    scanner.close();
                    return;
                }
                break;

            case "Plovdiv":
                if (s >= 0 && s <= 500) {
                    commission = s * 0.055;
                } else if (s > 500 && s <= 1000) {
                    commission = s * 0.08;
                } else if (s > 1000 && s <= 10000) {
                    commission = s * 0.12;
                } else if (s > 10000) {
                    commission = s * 0.145;
                } else {
                    System.out.println("error");
                    scanner.close();
                    return;
                }
                break;

            default:
                System.out.println("error");
                scanner.close();
                return;
        }

        System.out.printf("%.2f\n", commission);
        scanner.close();
    }
}
