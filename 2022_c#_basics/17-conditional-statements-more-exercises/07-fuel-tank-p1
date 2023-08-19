using System;

namespace _07_Fuel_Tank
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string fuelType = Console.ReadLine();
            const string DIESEL = "Diesel";
            const string GASOLINE = "Gasoline";
            const string GAS = "Gas";

            int fuelIn = int.Parse(Console.ReadLine());

            if (fuelType != DIESEL && fuelType != GASOLINE && fuelType != GAS)
            {
                Console.WriteLine($"Invalid fuel!");
            }
            else
            {
                if (fuelIn >= 25)
                {
                    if (fuelType == DIESEL)
                    {
                        Console.WriteLine($"You have enough diesel.");
                    }
                    else if (fuelType == GASOLINE)
                    {
                        Console.WriteLine($"You have enough gasoline.");
                    }
                    else if (fuelType == GAS)
                    {
                        Console.WriteLine($"You have enough gas.");
                    }
                }
                else
                {
                    if (fuelType == DIESEL)
                    {
                        Console.WriteLine($"Fill your tank with diesel!");
                    }
                    else if (fuelType == GASOLINE)
                    {
                        Console.WriteLine($"Fill your tank with gasoline!");
                    }
                    else if (fuelType == GAS)
                    {
                        Console.WriteLine($"Fill your tank with gas!");
                    }
                }
            }
        }
    }
}
