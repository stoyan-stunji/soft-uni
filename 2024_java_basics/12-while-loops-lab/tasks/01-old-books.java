import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String book = scanner.nextLine();
        
        int checkedBooks = 0;
        boolean foundBook = false;

        while (!book.equals("No More Books")) {
            if (book.equals(searchedBook)) {
                foundBook = true;
                System.out.println("You checked " + checkedBooks + " books and found it.");
                break;
            }
            checkedBooks++;
            book = scanner.nextLine();
        }

        if (!foundBook) {
            System.out.println("The book you search is not here!");
            System.out.println("You checked " + checkedBooks + " books.");
        }

        scanner.close();
    }
}
