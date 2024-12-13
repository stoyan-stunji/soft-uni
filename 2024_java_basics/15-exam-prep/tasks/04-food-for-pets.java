
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer days = Integer.parseInt(scanner.nextLine());
        Double food = Double.parseDouble(scanner.nextLine());

        Vector<Integer> dogFood = new Vector<>();
        Vector<Integer> catFood = new Vector<>();

        Double cookies = 0.0;

        for(int i = 1; i <= days; ++i)
        {
            Integer j = Integer.parseInt(scanner.nextLine());
            dogFood.add(j);

            Integer k = Integer.parseInt(scanner.nextLine());
            catFood.add(k);

            if (i % 3 == 0)
            {
                double bonus = (j + k) * 0.10;
                cookies = cookies + bonus;
            }
        }

        Integer allFood = 0;
        for(int i = 0; i < dogFood.size(); ++i)
        {
            allFood += dogFood.get(i);
        }
        for(int i = 0; i < catFood.size(); ++i)
        {
            allFood += catFood.get(i);
        }

        Double allFoodPercent = (allFood / food) * 100;
        // System.out.println(allFoodPercent);

        Double onlyDogFood = 0.0;
        for(int i = 0; i < dogFood.size(); ++i)
        {
            onlyDogFood += dogFood.get(i);
        }

        Double dogFoodPercent = (onlyDogFood / allFood) * 100;
        // System.out.println(dogFoodPercent);

        Double onlyCatFood = 0.0;
        for(int i = 0; i < catFood.size(); ++i)
        {
            onlyCatFood += catFood.get(i);
        }

        Double catFoodPercent = (onlyCatFood / allFood) * 100;
        // System.out.println(catFoodPercent);

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(cookies));
        System.out.printf("%.2f%% of the food has been eaten.%n", allFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.%n", dogFoodPercent);
        System.out.printf("%.2f%% eaten from the cat.%n", catFoodPercent);
    }
}
