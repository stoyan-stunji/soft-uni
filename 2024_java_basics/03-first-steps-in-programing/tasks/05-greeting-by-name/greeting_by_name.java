import java.util.Scanner;

public class greetings_by_name
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}
