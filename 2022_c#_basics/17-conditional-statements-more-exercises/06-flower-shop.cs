using System;

namespace _06_Flower_Shop
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double priceMagnolia = 3.25;
            double priceHyacinth = 4;
            double priceRose = 3.50;
            double priceCactus = 8;

            int numberMagnolia = int.Parse(Console.ReadLine());
            int numberHyacinth = int.Parse(Console.ReadLine());
            int numberRose = int.Parse(Console.ReadLine());
            int numberCactus = int.Parse(Console.ReadLine());
            double priceGift = double.Parse(Console.ReadLine());

            double price = priceMagnolia * numberMagnolia + priceHyacinth * numberHyacinth + priceRose * numberRose + priceCactus * numberCactus;
            double tax = price * 0.05;
            double finalPrice = price - tax;

            if (finalPrice < priceGift)
            {
                double moneyNeeded = priceGift - finalPrice;
                Console.WriteLine($"She will have to borrow {Math.Ceiling(moneyNeeded)} leva.");
            }
            else 
            {
                double moneyLeft = finalPrice - priceGift;
                Console.WriteLine($"She is left with {Math.Floor(moneyLeft)} leva.");
            }
        }
    }
}
