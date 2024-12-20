
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.parseInt(scanner.nextLine());

        Vector<Double> litres = new Vector<>();
        Vector<Double> degrees = new Vector<>();

        for (int i = 0; i < n; i++)
        {
            Double l = Double.parseDouble(scanner.nextLine());
            litres.add(l);
            Double d = Double.parseDouble(scanner.nextLine());
            degrees.add(l * d);
        }

        Double litresSum = 0.0;
        for (int i = 0; i < litres.size(); i++)
        {
            litresSum += litres.get(i);
        }

        Double degreesSum = 0.0;
        for (int i = 0; i < degrees.size(); i++)
        {
            degreesSum += degrees.get(i);
        }

        degreesSum = degreesSum / litresSum;

        System.out.printf("Liter: %.2f\n", litresSum);
        System.out.printf("Degrees: %.2f\n", degreesSum);

        if(degreesSum < 38)
        {
            System.out.println("Not good, you should baking!");
        }
        else if(38 <= degreesSum && degreesSum <= 42)
        {
            System.out.println("Super!");
        }
        else
        {
            System.out.println("Dilution with distilled water!");
        }
    }
}
