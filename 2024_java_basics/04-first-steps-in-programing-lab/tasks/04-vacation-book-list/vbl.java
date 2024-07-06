import java.util.Scanner;

public class vbl
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int num_of_pages = Integer.parseInt(s.nextLine());
        int pages_per_hour = Integer.parseInt((s.nextLine()));
        int days = Integer.parseInt(s.nextLine());

        int hours = num_of_pages / pages_per_hour;
        int final_hours = hours / days;

        System.out.println(final_hours);
        s.close();
    }
}