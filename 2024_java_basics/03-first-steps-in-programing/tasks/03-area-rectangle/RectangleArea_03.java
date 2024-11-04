package FirstStepsInCoding;

import java.util.Scanner;

public class RectangleArea_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Прочитаме първия ред от конзолата
        int sideA = Integer.parseInt(scanner.nextLine());
        //Прочитаме втория ред от конзолата
        int sideB = Integer.parseInt(scanner.nextLine());

        //пресмятаме колко е лицето на правоъгълника
        int area = sideA * sideB; // 5 * 7 = 35

        System.out.println(area);





    }
}
