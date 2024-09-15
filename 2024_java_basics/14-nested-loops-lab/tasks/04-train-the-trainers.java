import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int people = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character
        String presentation = scanner.nextLine();
        
        double avgScoreAll = 0;
        int counter = 0;
        
        while (!presentation.equals("Finish")) {
            double avgScore = 0;
            
            for (int i = 0; i < people; i++) {
                double score = scanner.nextDouble();
                avgScore += score;
                avgScoreAll += score;
                counter++;
            }
            
            double avgScorePr = avgScore / people;
            System.out.printf("%s - %.2f.%n", presentation, avgScorePr);
            
            scanner.nextLine(); // Consume the leftover newline character
            presentation = scanner.nextLine();
        }
        
        double assessment = avgScoreAll / counter;
        System.out.printf("Student's final assessment is %.2f.%n", assessment);
        
        scanner.close();
    }
}
