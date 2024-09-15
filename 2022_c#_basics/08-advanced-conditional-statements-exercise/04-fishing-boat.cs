using System;

namespace _04_Fishing_Boat
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string season = Console.ReadLine();
            int fishers = int.Parse(Console.ReadLine());

            double discount = 0.0;
            double discount2 = 0.0;
            double priceShip = 0;

            switch (season)
            {
                case "Spring":
                    priceShip = 3000;
                    if (fishers <= 6)
                    {
                        discount = 0.1;
                    }
                    else if (fishers > 7 && fishers <= 11)
                    {
                        discount = 0.15;
                    }
                    else if (fishers > 12)
                    {
                        discount = 0.25;
                    }
                    break;

                case "Summer":
                    priceShip = 4200;
                    if (fishers <= 6)
                    {
                        discount = 0.1;
                    }
                    else if (fishers > 7 && fishers <= 11)
                    {
                        discount = 0.15;
                    }
                    else if (fishers > 12)
                    {
                        discount = 0.25;
                    }
                    break;

                case "Autumn":
                    priceShip = 4200;
                    if (fishers <= 6)
                    {
                        discount = 0.1;
                    }
                    else if (fishers > 7 && fishers <= 11)
                    {
                        discount = 0.15;
                    }
                    else if (fishers > 12)
                    {
                        discount = 0.25;
                    }
                    break;

                case "Winter":
                    priceShip = 2600;
                    if (fishers <= 6)
                    {
                        discount = 0.1;
                    }
                    else if (fishers > 7 && fishers <= 11)
                    {
                        discount = 0.15;
                    }
                    else if (fishers > 12)
                    {
                        discount = 0.25;
                    }
                    break;
            }

            double priceDiscount1 = priceShip - (priceShip * discount);

            if (fishers % 2 == 0)
            {
                if (season == "Summer" || season == "Spring" || season == "Winter")
                {
                    discount2 = 0.05;
                }

                else if (season == "Autumn")
                {
                    discount2 = 0.0;
                }
            }
            else if (fishers % 2 != 0)
            {
                discount2 = 0.0;
            }

            double priceDiscount2 = priceDiscount1 - (priceDiscount1 * discount2);

            if (budget >= priceDiscount2)
            {
                double moneyLeft = budget - priceDiscount2;
                Console.WriteLine($"Yes! You have {moneyLeft:f2} leva left.");
            }
            else if (budget < priceDiscount2)
            {
                double moneyNeeded = priceDiscount2 - budget;
                Console.WriteLine($"Not enough money! You need {moneyNeeded:f2} leva.");
            }
        }
    }
}
