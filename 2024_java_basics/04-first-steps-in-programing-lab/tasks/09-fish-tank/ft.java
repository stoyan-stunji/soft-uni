import java.util.Scanner;

public class ft
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int length = Integer.parseInt(s.nextLine());
        int depth = Integer.parseInt(s.nextLine());
        int height = Integer.parseInt(s.nextLine());
        double percent = Double.parseDouble(s.nextLine());

        double volume = length * depth * height;
        double volume_in_litres = volume * 0.001;
        double needed_litres = volume_in_litres * (1 - (percent / 100));

        System.out.println(needed_litres);

        s.close();
    }
}