using System;

namespace _03_Harvest
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int areaX = int.Parse(Console.ReadLine());
            double squareMeterY = double.Parse(Console.ReadLine());
            int litreZ = int.Parse(Console.ReadLine());
            int numberWorkers = int.Parse(Console.ReadLine());

            double grapesAll = areaX * squareMeterY;
            double wine = 0.4 * grapesAll / 2.5;

            if (wine >= litreZ)
            {
                double wineLeft = wine - litreZ;
                double wineProPerson = wineLeft / numberWorkers;
                Console.WriteLine($"Good harvest this year! Total wine: {Math.Floor(wine)} liters.");
                Console.WriteLine($"{Math.Ceiling(wineLeft)} liters left -> {Math.Ceiling(wineProPerson)} liters per person.");
            }
            else 
            {
                double wineNeeded = litreZ - wine;
                Console.WriteLine($"It will be a tough winter! More {Math.Floor(wineNeeded)} liters wine needed.");
            }

        }
    }
}
