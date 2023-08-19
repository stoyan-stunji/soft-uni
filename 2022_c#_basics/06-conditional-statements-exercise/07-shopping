using System;

namespace _07_Shopping
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int numberVideoCard = int.Parse(Console.ReadLine());
            int numberProcessor = int.Parse(Console.ReadLine());
            int numberRAM = int.Parse(Console.ReadLine());

            double finalPrizeVideoCard = numberVideoCard * 250;

            double prizeProcessor = finalPrizeVideoCard * 0.35;
            double finalPrizeProcessor = numberProcessor * prizeProcessor;

            double prizeRAM = finalPrizeVideoCard * 0.1;
            double finalPrizeRAM = numberRAM * prizeRAM;

            double finalPrize = finalPrizeVideoCard + finalPrizeProcessor + finalPrizeRAM;

            if (numberVideoCard > numberProcessor)
            {
                finalPrize = finalPrize * 0.85;
            }

            if (budget >= finalPrize)
            {
                double moneyLeft = budget - finalPrize;
                Console.WriteLine($"You have {moneyLeft:f2} leva left!");
            }
            else
            {
                double moneyNeeded = finalPrize - budget;
                Console.WriteLine($"Not enough money! You need {moneyNeeded:f2} leva more!");
            }
        }
    }
}
