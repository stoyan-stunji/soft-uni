using System;

namespace _07_Hotel_Room
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string month = Console.ReadLine();
            int nights = int.Parse(Console.ReadLine());

            double priceStudio = 0.0;
            double priceApartment = 0.0;

            switch (month)
            {
                case "May":
                case "October":
                    priceStudio = 50;
                    priceApartment = 65;

                    if (nights > 7 && nights <= 14)
                    {
                        priceStudio *= 0.95;
                    }
                    else if (nights > 14)
                    {
                        priceStudio *= 0.70;
                        priceApartment *= 0.90;
                    }
                    break;

                case "June":
                case "September":
                    priceStudio = 75.20;
                    priceApartment = 68.70;

                    if (nights > 14)
                    {
                        priceStudio *= 0.8;
                        priceApartment *= 0.90;
                    }
                    break;

                case "July":
                case "August":
                    priceStudio = 76;
                    priceApartment = 77;

                    if (nights > 14)
                    {
                        priceApartment *= 0.9;
                    }

                    break;
            }

            double finalPriceApartment = priceApartment * nights;
            double finalPriceStudio = priceStudio * nights;
            Console.WriteLine($"Apartment: {finalPriceApartment:f2} lv.");
            Console.WriteLine($"Studio: {finalPriceStudio:f2} lv.");
        }
    }
}
