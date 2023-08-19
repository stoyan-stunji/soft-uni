using System;

namespace _05_Godzilla_vs._Kong
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            int extra = int.Parse(Console.ReadLine());
            double prizeClothes = double.Parse(Console.ReadLine());

            double decor = budget * 0.1;
            double prizeClothesOfExtras = prizeClothes * extra;

            if (extra > 150)
            {
                prizeClothesOfExtras = prizeClothesOfExtras * 0.9;
            }
         
            double finalPrize = decor + prizeClothesOfExtras;

            if (finalPrize > budget)
            {
                Console.WriteLine($"Not enough money!");
                double moneyNeeded = finalPrize - budget;
                Console.WriteLine($"Wingard needs {moneyNeeded:f2} leva more.");          
            }
            else 
            {
                Console.WriteLine($"Action!");
                double moneyLeft = budget - finalPrize;
                Console.WriteLine($"Wingard starts filming with {moneyLeft:f2} leva left.");
            }

        }
    }
}
