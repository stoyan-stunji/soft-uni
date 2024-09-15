using System;

namespace _03_New_House
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string typeOfFlower = Console.ReadLine();
            int qnt = int.Parse(Console.ReadLine());
            double budget = double.Parse(Console.ReadLine());

            double priceRoses = 5;
            double priceDahlias = 3.80;
            double priceTulips = 2.80;
            double priceNarcissus = 3;
            double priceGladiolus = 2.50;

            double finalPrice = 0.0;
            double finalPriceDiscount = 0.0;

            switch (typeOfFlower)
            {
                case "Roses":
                    if (qnt > 80)
                    {
                        finalPrice = qnt * priceRoses;
                        finalPriceDiscount = finalPrice - (finalPrice * 0.1);
                    }
                    else
                    {
                        finalPriceDiscount = qnt * priceRoses;
                    }
                    break;
                case "Dahlias":
                    if (qnt > 90)
                    {
                        finalPrice = qnt * priceDahlias;
                        finalPriceDiscount = finalPrice - (finalPrice * 0.15);
                    }
                    else
                    {
                        finalPriceDiscount = qnt * priceDahlias;
                    }
                    break;
                case "Tulips":
                    if (qnt > 80)
                    {
                        finalPrice = qnt * priceTulips;
                        finalPriceDiscount = finalPrice - (finalPrice * 0.15);
                    }
                    else
                    {
                        finalPriceDiscount = qnt * priceTulips;
                    }
                    break;
                case "Narcissus":
                    if (qnt < 120)
                    {
                        finalPrice = qnt * priceNarcissus;
                        finalPriceDiscount = finalPrice + (finalPrice * 0.15);
                    }
                    else
                    {
                        finalPriceDiscount = qnt * priceNarcissus;
                    }
                    break;
                case "Gladiolus":
                    if (qnt < 80)
                    {
                        finalPrice = qnt * priceGladiolus;
                        finalPriceDiscount = finalPrice + (finalPrice * 0.20);
                    }
                    else
                    {
                        finalPriceDiscount = qnt * priceGladiolus;
                    }
                    break;
            }

            if (budget >= finalPriceDiscount)
            {
                double moneyLeft = budget - finalPriceDiscount;
                Console.WriteLine($"Hey, you have a great garden with {qnt} {typeOfFlower} and {moneyLeft:f2} leva left.");
            }
            else if (budget < finalPriceDiscount)
            {
                double moneyNeeded = finalPriceDiscount - budget;
                Console.WriteLine($"Not enough money, you need {moneyNeeded:f2} leva more.");
            }
        }
    }
}
