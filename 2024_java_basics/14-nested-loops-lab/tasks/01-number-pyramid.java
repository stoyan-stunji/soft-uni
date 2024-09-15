import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int number = 1;
        boolean isBigger = false;
        
        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                if (number > n) {
                    isBigger = true;
                    break;
                }

                System.out.print(number + " ");
                number++;
            }

            if (isBigger) {
                break;
            }

            System.out.println();
        }
        
        scanner.close();
    }
}
