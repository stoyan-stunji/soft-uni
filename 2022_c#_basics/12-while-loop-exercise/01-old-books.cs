using System;

namespace _01_Old_Books
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string searchedBook = Console.ReadLine();
            string book = Console.ReadLine();
            int checkedBooks = 0;
            int foundBook = 0;

            while (book != "No More Books")
            {
                if (book == searchedBook)
                {
                    foundBook += 1;

                    if (foundBook > 0)
                    {
                        Console.WriteLine($"You checked {checkedBooks} books and found it.");
                        break;
                    }

                }
                checkedBooks += 1;
                book = Console.ReadLine();
            }

            if (foundBook == 0)
            {
                Console.WriteLine($"The book you search is not here!");
                Console.WriteLine($"You checked {checkedBooks} books.");
            }
        }
    }
}
