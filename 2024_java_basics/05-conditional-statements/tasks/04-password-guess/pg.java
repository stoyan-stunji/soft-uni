import java.util.Scanner;

public class pg
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        String str = s.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if(str.equals(password))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Wrong password!");
        }

        s.close();
    }
}