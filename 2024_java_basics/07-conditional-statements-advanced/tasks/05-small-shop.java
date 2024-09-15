import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double totalSum = 0;

        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        totalSum = quantity * 0.50;
                        break;
                    case "water":
                        totalSum = quantity * 0.80;
                        break;
                    case "beer":
                        totalSum = quantity * 1.20;
                        break;
                    case "sweets":
                        totalSum = quantity * 1.45;
                        break;
                    case "peanuts":
                        totalSum = quantity * 1.60;
                        break;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        totalSum = quantity * 0.40;
                        break;
                    case "water":
                        totalSum = quantity * 0.70;
                        break;
                    case "beer":
                        totalSum = quantity * 1.15;
                        break;
                    case "sweets":
                        totalSum = quantity * 1.30;
                        break;
                    case "peanuts":
                        totalSum = quantity * 1.50;
                        break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        totalSum = quantity * 0.45;
                        break;
                    case "water":
                        totalSum = quantity * 0.70;
                        break;
                    case "beer":
                        totalSum = quantity * 1.10;
                        break;
                    case "sweets":
                        totalSum = quantity * 1.35;
                        break;
                    case "peanuts":
                        totalSum = quantity * 1.55;
                        break;
                }
                break;
        }

        System.out.println(totalSum);
        scanner.close();
    }
}
