using System;

namespace _04_Transport_Price
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            string timeOfDay = Console.ReadLine();
            const string DAY = "day";
            const string NIGHT = "night";

            double priceTaxi = 0.7;
            double priceTaxiDay = 0.79;
            double priceTaxiNight = 0.9;
            double priceBus = 0.09;
            double priceTrain = 0.06;

            double price = 0.0;

            if (n < 20)
            {
                if (timeOfDay == DAY)
                {
                    price = priceTaxi + n * priceTaxiDay;
                }

                if (timeOfDay == NIGHT)
                {
                    price = priceTaxi + n * priceTaxiNight;
                }
            }
            else if (n >= 20 && n < 100)
            {
                price = n * priceBus;
            }
            else if (n >= 100)
            {
                price = n * priceTrain;
            }
            Console.WriteLine($"{price:f2}");
        }
    }
}
