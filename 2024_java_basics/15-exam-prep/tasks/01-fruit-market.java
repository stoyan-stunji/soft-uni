package ExamPrep;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        //•	цената на малините е на половина по-ниска от тази на ягодите;
        double raspberriesPrice = strawberriesPrice / 2;
        //•	цената на портокалите е с 40% по-ниска от цената на малините;
        double orangePrice = raspberriesPrice - (raspberriesPrice * 0.40);
        //•	цената на бананите е с 80% по-ниска от цената на малините.
        double bananasPrice = raspberriesPrice - (raspberriesPrice * 0.80);

        double raspberriesSum = raspberriesPrice * raspberriesKg;
        double orangeSum = orangePrice * orangeKg;
        double bananasSum = bananasPrice * bananasKg;
        double strawberriesSum = strawberriesPrice * strawberriesKg;

        double totalSum = raspberriesSum + orangeSum + bananasSum + strawberriesSum;

        System.out.printf("%.2f", totalSum);
    }
}
