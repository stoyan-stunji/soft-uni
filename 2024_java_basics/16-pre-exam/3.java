
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rating = scanner.nextLine();

        Double pricePerNight = 0.0;
        Double percent = 0.0;

        if(room.equals("room for one person"))
        {
            if(days < 10)
            {
                percent = 0.0;
            }
            else if (10 <= days && days <= 15)
            {
                percent = 0.0;
            }
            else
            {
                percent = 0.0;
            }
            pricePerNight = 18.0;
        }
        else if(room.equals("apartment"))
        {
            if(days < 10)
            {
                percent = 30.0;
            }
            else if(10 <= days && days <= 15)
            {
                percent = 35.0;
            }
            else
            {
                percent = 50.0;
            }
            pricePerNight = 25.0;
        }
        else if(room.equals("president apartment"))
        {
            if(days < 10)
            {
                percent = 10.0;
            }
            else if(10 <= days && days <= 15)
            {
                percent = 15.0;
            }
            else
            {
                percent = 20.0;
            }
            pricePerNight = 35.0;
        }

        Integer nights = days - 1;
        Double allPrice = nights * pricePerNight;
        allPrice = allPrice - ((allPrice * percent) / 100);

        if(rating.equals("positive"))
        {
            allPrice = allPrice + ((allPrice * 25) / 100);
        }
        else if(rating.equals("negative"))
        {
            allPrice = allPrice - ((allPrice * 10) / 100);
        }

        System.out.printf("%.2f", allPrice);
    }
}
