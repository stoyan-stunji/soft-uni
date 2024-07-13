import java.util.Scanner;

public class fm
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int hours = Integer.parseInt(s.nextLine());
        int minutes = Integer.parseInt(s.nextLine());

        minutes += 15;

        if (minutes >= 60)
        {
            hours += 1;
            minutes -= 60;
        }

        if (hours >= 24)
        {
            hours = 0;
        }

        if(minutes < 10)
        {
            System.out.println(hours + ":0" + minutes);
        }
        else
        {
            System.out.println(hours + ":" + minutes);
        }

        s.close();
    }
}