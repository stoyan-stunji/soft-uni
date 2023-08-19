using System;

namespace _01_Cinema
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string ticket = Console.ReadLine();
            int r = int.Parse(Console.ReadLine());
            int c = int.Parse(Console.ReadLine());
            double income = 0.0;

            switch (ticket)
            {
                case "Premiere":
                    income = r * c * 12.00;
                    break;

                case "Normal":
                    income = r * c * 7.50;
                    break;

                case "Discount":
                    income = r * c * 5.00;
                    break;
            }
            if (income > 0)
            {
                Console.WriteLine($"{income:f2} leva");
            }
        }
    }
}
