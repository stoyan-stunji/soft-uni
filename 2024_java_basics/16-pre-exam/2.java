
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double daily = Double.parseDouble(scanner.nextLine());
        Double profitPerDay = Double.parseDouble(scanner.nextLine());
        Double expences = Double.parseDouble(scanner.nextLine());
        Double present = Double.parseDouble(scanner.nextLine());

        Double allDaily = 5 * daily;
        Double allProfit = 5 * profitPerDay;
        Double sum = allDaily + allProfit;
        sum = sum - expences;

        Double diff = sum - present;

        if(diff >= 0)
        {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", sum);
        }
        else
        {
            System.out.printf("Insufficient money: %.2f BGN.", -diff);
        }
    }
}
