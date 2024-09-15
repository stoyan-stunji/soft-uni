using System;

namespace _06_Cinema_Tickets
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nameMovie = Console.ReadLine();

            int studentCounter = 0;
            int standardCounter = 0;
            int kidCounter = 0;

            while (nameMovie != "Finish")
            {
                int freePlaces = int.Parse(Console.ReadLine());
                int counter = 0;

                while (freePlaces > counter)
                {
                    string typeTicket = Console.ReadLine();

                    if (typeTicket == "End")
                    {
                        break;
                    }

                    if (typeTicket == "student")
                    {
                        studentCounter++;
                    }
                    else if (typeTicket == "standard")
                    {
                        standardCounter++;
                    }
                    else if (typeTicket == "kid")
                    {
                        kidCounter++;
                    }

                    counter++;
                }

                double avgPlaces = counter * 100.0 / freePlaces;
                Console.WriteLine($"{nameMovie} - {avgPlaces:f2}% full.");
                
                nameMovie = Console.ReadLine();
            }

            int allTickets = studentCounter + standardCounter + kidCounter;
            double pSt = studentCounter * 100.0 / allTickets;
            double pSd = standardCounter * 100.0 / allTickets;
            double pK = kidCounter * 100.0 / allTickets;

            Console.WriteLine($"Total tickets: {allTickets}");
            Console.WriteLine($"{pSt:f2}% student tickets.");
            Console.WriteLine($"{pSd:f2}% standard tickets.");
            Console.WriteLine($"{pK:f2}% kids tickets.");

        }
    }
}
