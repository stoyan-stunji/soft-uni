import java.util.Scanner;

public class aof
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        String f = s.nextLine();

        if(f.equals("square"))
        {
            double a = Double.parseDouble(s.nextLine());
            double area = a * a;
            System.out.println(area);
        }
        else if(f.equals("rectangle"))
        {
            double a = Double.parseDouble(s.nextLine());
            double b = Double.parseDouble(s.nextLine());
            double area = a * b;
            System.out.println(area);
        }
        else if(f.equals("circle"))
        {
            double a = Double.parseDouble(s.nextLine());
            double area = a * Math.PI * a;
            System.out.println(area);
        }
        else if(f.equals("triangle"))
        {
            double a = Double.parseDouble(s.nextLine());
            double b = Double.parseDouble(s.nextLine());
            double area = a * (b / 2);
            System.out.println(area);
        }

        s.close();
    }
}