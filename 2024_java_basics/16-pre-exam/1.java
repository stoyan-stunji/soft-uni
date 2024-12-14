
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer paper = Integer.parseInt(scanner.nextLine());
        Integer cloth = Integer.parseInt(scanner.nextLine());
        Double glue = Double.parseDouble(scanner.nextLine());
        Integer percent = Integer.parseInt(scanner.nextLine());

        Double paperPrice = paper * 5.80;
        Double clothPrice = cloth * 7.20;
        Double gluePrice = glue * 1.20;

        Double sum = paperPrice + clothPrice + gluePrice;
        sum = sum - ((sum * percent) / 100);

        System.out.printf("%.3f", sum);
    }
}
