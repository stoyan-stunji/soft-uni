import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hExam = scanner.nextInt();
        int mExam = scanner.nextInt();
        int hArrival = scanner.nextInt();
        int mArrival = scanner.nextInt();

        int mExamSum = (hExam * 60) + mExam;
        int mArrivalSum = (hArrival * 60) + mArrival;

        int difference = mArrivalSum - mExamSum;

        if (difference > 0) {
            if (difference < 60) {
                System.out.println("Late");
                System.out.println(difference + " minutes after the start");
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("Late%n%d:%02d hours after the start%n", hours, minutes);
            }
        } else if (difference == 0) {
            System.out.println("On time");
        } else {
            difference = -difference; // Make it positive for easier handling

            if (difference <= 30) {
                System.out.println("On time");
                if (difference != 0) {
                    System.out.println(difference + " minutes before the start");
                }
            } else {
                if (difference < 60) {
                    System.out.println("Early");
                    System.out.println(difference + " minutes before the start");
                } else {
                    int hours = difference / 60;
                    int minutes = difference % 60;
                    System.out.printf("Early%n%d:%02d hours before the start%n", hours, minutes);
                }
            }
        }

        scanner.close();
    }
}
