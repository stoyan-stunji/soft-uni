import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int countGrade = 1;
        int countExcluded = 0;
        double sumGrades = 0;

        while (countGrade <= 12){
            if(countExcluded == 2){
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if(currentGrade >= 4){
                countGrade++;
                sumGrades += currentGrade;
            }else {
                countExcluded++;
                continue;
            }
            //System.out.println(currentGrade);
        }

        if(countExcluded == 2){
            System.out.printf("%s has been excluded at %d grade", name, countGrade);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumGrades/12);
        }

    }
}
