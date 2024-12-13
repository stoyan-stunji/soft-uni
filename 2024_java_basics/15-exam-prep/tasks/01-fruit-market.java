
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double strawberryPrice = Double.parseDouble(scanner.nextLine());
        Double bananaKG = Double.parseDouble(scanner.nextLine());
        Double orangesKG = Double.parseDouble(scanner.nextLine());
        Double berryKG = Double.parseDouble(scanner.nextLine());
        Double strawberryKB = Double.parseDouble(scanner.nextLine());

        Double berryPrice = strawberryPrice / 2;
        Double orangesPrice = berryPrice - (berryPrice * 0.4);
        Double bananaPrice = berryPrice - (berryPrice * 0.8);

        Double strawberries = strawberryPrice * strawberryKB;
        Double bananas = bananaPrice * bananaKG;
        Double oranges = orangesPrice * orangesKG;
        Double berries = berryPrice * berryKG;

        Double sum = berries + strawberries + bananas + oranges;

        System.out.printf("%.2f", sum);
    }
}
