
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double budget = Double.parseDouble(sc.nextLine());
        Integer nights = Integer.parseInt(sc.nextLine());
        Double pricePerNight = Double.parseDouble(sc.nextLine());
        Integer addProcent = Integer.parseInt(sc.nextLine());

        if (nights > 7)
        {
            pricePerNight = pricePerNight - (pricePerNight * 0.05);
        }

        Double nightSum = nights * pricePerNight;
        Double additional = (budget * addProcent * 1.0) / 100;
        Double sum = nightSum + additional;

        Double diff = budget - sum;

        if(diff >= 0)
        {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        }
        else
        {
            System.out.printf("%.2f leva needed.", -diff);
        }
    }
}
