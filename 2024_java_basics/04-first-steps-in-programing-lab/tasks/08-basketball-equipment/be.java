import java.util.Scanner;

public class be
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int bill = Integer.parseInt(s.nextLine());

        double shoes = bill - (bill * 0.4);
        double outfit = shoes - (shoes * 0.2);
        double ball = outfit * 0.25;
        double acs = ball * 0.20;

        double sum = bill + shoes + outfit + ball + acs;

        System.out.println(sum);

        s.close();
    }
}