import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double time = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") ||
            day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday")) {
            
            if (time >= 10 && time <= 18) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }

        } else {
            System.out.println("closed");
        }

        scanner.close();
    }
}
