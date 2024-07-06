import java.util.Scanner;

public class yard_greening
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double square_metres = Double.parseDouble(scanner.nextLine());
        double full_price = square_metres * 7.61;
        double discount = full_price * 0.18;
        double final_price = full_price - discount;
        System.out.println("The final price is: " + final_price + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
        scanner.close();
    }
}