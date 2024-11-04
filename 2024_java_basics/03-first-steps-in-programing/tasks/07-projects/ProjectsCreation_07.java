package FirstStepsInCoding;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме входните данни
        String name = scanner.nextLine();
        int countProjects = Integer.parseInt(scanner.nextLine());

        //пресмятаме колко време е необходимо за изготвяне на всички проекти
        int neededTime = countProjects * 3;

        //принтираме резултата
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, neededTime, countProjects);

    }
}
