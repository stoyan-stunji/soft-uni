import java.util.Scanner;

public class concatenate_data
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String first_name = scanner.nextLine();
        String second_name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.println("You are " + first_name + " " + second_name + ", a " + age +
        "-years old person from " + town + ".");
        scanner.close();
    }
}
