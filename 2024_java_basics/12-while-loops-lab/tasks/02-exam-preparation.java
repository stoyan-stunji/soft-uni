import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the maximum number of unsatisfactory problems allowed
        double unsatisfyingProblemsNumber = Double.parseDouble(scanner.nextLine());
        double unsatisfyingProblemsNumberCount = 0;
        double allProblems = 0;
        double totalRating = 0;
        String nameProblem = scanner.nextLine();

        String lastProblem = "";

        while (!nameProblem.equals("Enough")) {
            lastProblem = nameProblem;
            double ratingProblem = Double.parseDouble(scanner.nextLine());
            totalRating += ratingProblem;
            allProblems++;

            if (ratingProblem <= 4) {
                unsatisfyingProblemsNumberCount++;
            }

            if (unsatisfyingProblemsNumber == unsatisfyingProblemsNumberCount) {
                System.out.println("You need a break, " + (int) unsatisfyingProblemsNumberCount + " poor grades.");
                break;
            }

            nameProblem = scanner.nextLine();
        }

        if (nameProblem.equals("Enough")) {
            double averageScore = totalRating / allProblems;

            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.println("Number of problems: " + (int) allProblems);
            System.out.println("Last problem: " + lastProblem);
        }

        scanner.close();
    }
}
