package FirstStepsInCoding;

import java.util.Scanner;

public class InchesToCentimeters_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //прочитаме инчовете от конзолата
        double inches = Double.parseDouble(scanner.nextLine());

        //пресмятаме предоставените инчове колко сантиметра са
        double sm = inches * 2.54;

        //принтираме резултата
        System.out.println(sm);


    }
}
