import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();
        double rating = Double.parseDouble(scanner.nextLine());

        double totalRating = 0;
        double avgRating = 0;
        int grade = 1;
        int fails = 0;

        while (grade <= 12) {
            if (rating < 4.00) {
                fails++;
            }

            if (fails == 2) {
                System.out.printf("%s has been excluded at %d grade%n", student, grade);
                break;
            }

            totalRating += rating;
            avgRating = totalRating / grade;
            grade++;

            if (grade > 12) {
                System.out.printf("%s graduated. Average grade: %.2f%n", student, avgRating);
                break;
            }

            rating = Double.parseDouble(scanner.nextLine());
        }

        scanner.close();
    }
}
