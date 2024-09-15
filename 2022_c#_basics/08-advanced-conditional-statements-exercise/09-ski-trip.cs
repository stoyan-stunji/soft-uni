using System;

namespace _09_Ski_Trip
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int days = int.Parse(Console.ReadLine());
            string room = Console.ReadLine();
            string rating = Console.ReadLine();

            int nights = days - 1;
            double discount1 = 0.0;
            double discount2 = 0.0;
            double price = 0.0;
            double priceDiscoount2 = 0.0;

            switch (room)
            {
                case "room for one person":
                    discount1 = 0.0;
                    price = nights * 18.00;
                break;

                case "apartment":
                    if (days <= 10)
                    {
                        discount1 = 0.3;
                    }
                    else if (days > 10 && days <= 15)
                    {
                        discount1 = 0.35;
                    }
                    else if (days > 15)
                    {
                        discount1 = 0.5;
                    }
                    price = nights * 25.00;
                     
                    break;

                case "president apartment":
                    if (days <= 10)
                    {
                        discount1 = 0.1;
                    }
                    else if (days > 10 && days <= 15)
                    {
                        discount1 = 0.15;
                    }
                    else if (days > 15)
                    {
                        discount1 = 0.2;
                    }
                    price = nights * 35.00;
                    break;
            }

            double priceDiscount1 = price - (price * discount1);

            switch (rating)
            {
                case "positive":
                    discount2 = 0.25;
                    priceDiscoount2 = priceDiscount1 + (priceDiscount1 * discount2);
                    Console.WriteLine($"{priceDiscoount2:f2}");
                    break;
                case "negative":
                    discount2 = 0.1;
                    priceDiscoount2 = priceDiscount1 - (priceDiscount1 * discount2);
                    Console.WriteLine($"{priceDiscoount2:f2}");
                    break;
            }
        }
    }
}
