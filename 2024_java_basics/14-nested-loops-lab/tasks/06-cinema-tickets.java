import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nameMovie = scanner.nextLine();
        
        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;
        
        while (!nameMovie.equals("Finish")) {
            int freePlaces = scanner.nextInt();
            scanner.nextLine(); // Consume the leftover newline character
            
            int counter = 0;
            
            while (counter < freePlaces) {
                String typeTicket = scanner.nextLine();
                
                if (typeTicket.equals("End")) {
                    break;
                }
                
                if (typeTicket.equals("student")) {
                    studentCounter++;
                } else if (typeTicket.equals("standard")) {
                    standardCounter++;
                } else if (typeTicket.equals("kid")) {
                    kidCounter++;
                }
                
                counter++;
            }
            
            double avgPlaces = (counter * 100.0) / freePlaces;
            System.out.printf("%s - %.2f%% full.%n", nameMovie, avgPlaces);
            
            nameMovie = scanner.nextLine();
        }
        
        int allTickets = studentCounter + standardCounter + kidCounter;
        double pSt = (studentCounter * 100.0) / allTickets;
        double pSd = (standardCounter * 100.0) / allTickets;
        double pK = (kidCounter * 100.0) / allTickets;
        
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", pSt);
        System.out.printf("%.2f%% standard tickets.%n", pSd);
        System.out.printf("%.2f%% kids tickets.%n", pK);
        
        scanner.close();
    }
}
