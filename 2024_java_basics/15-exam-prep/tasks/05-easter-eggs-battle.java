
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer feggs = Integer.parseInt(scanner.nextLine());
        Integer seggs = Integer.parseInt(scanner.nextLine());
        String cmd = scanner.nextLine();

        Boolean flag = false;

        while(!cmd.equals("End"))
        {
            if(cmd.equals("one"))
            {
                seggs--;
            }
            else if(cmd.equals("two"))
            {
                feggs--;
            }

            if (feggs == 0 || seggs == 0)
            {
                flag = true;
                break;
            }

            cmd = scanner.nextLine();
        }

        if (flag && feggs > 0)
        {
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", feggs);
        }
        else if (flag && seggs > 0)
        {
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", seggs);
        }
        else
        {
            System.out.printf("Player one has %d eggs left.%n", feggs);
            System.out.printf("Player two has %d eggs left.", seggs);
        }
    }
}
