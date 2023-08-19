using System;

namespace _04_Toy_Shop_RE
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double excursionPrize = double.Parse(Console.ReadLine());
            int puzzleNumber = int.Parse(Console.ReadLine());
            int puppetNumber = int.Parse(Console.ReadLine());
            int bearNumber = int.Parse(Console.ReadLine());
            int minionNumber = int.Parse(Console.ReadLine());
            int truckNumber = int.Parse(Console.ReadLine());

            double prizeToys = 2.6 * puzzleNumber + 3 * puppetNumber + 4.1 * bearNumber + 8.2 * minionNumber + 2 * truckNumber;
            int numberToys = puppetNumber + puppetNumber + bearNumber + minionNumber + truckNumber;

            if (numberToys >= 50)
            {
                double discount = prizeToys * 0.25;
                prizeToys = prizeToys - discount;
            }

            double rent = prizeToys * 0.1;
            double finalIncome = prizeToys - rent;

            if (finalIncome >= excursionPrize)
            {
                double moneyLeft = finalIncome - excursionPrize;
                Console.WriteLine($"Yes! {moneyLeft:f2} lv left.");

            }
            else
            {
                double moneyNeeded = excursionPrize - finalIncome;
                Console.WriteLine($"Not enough money! {moneyNeeded:f2} lv needed.");
            }

        }
    }
}
