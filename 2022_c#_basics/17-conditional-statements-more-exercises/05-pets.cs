using System;

namespace _05_Pets
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            int food = int.Parse(Console.ReadLine());
            double foodDog = double.Parse(Console.ReadLine()); 
            double foodCat = double.Parse(Console.ReadLine()); 
            double foodTurtle = double.Parse(Console.ReadLine());

            double needDog = days * foodDog;
            double needCat = days * foodCat;
            double needTurtle = (days * foodTurtle) * 0.001;

            double needFood = needDog + needCat + needTurtle;

            if (needFood <= food)
            {
                double foodLeft = food - needFood;
                Console.WriteLine($"{Math.Floor(foodLeft)} kilos of food left.");
            }
            else 
            {
                double foodNeeded = needFood - food;
                Console.WriteLine($"{Math.Ceiling(foodNeeded)} more kilos of food are needed.");
            }
            
        }
    }
}
