using System;

namespace _05_Journey
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double budget = double.Parse(Console.ReadLine());
            string season = Console.ReadLine();

            string destination = "";
            string rest = "";
            double savedMoney = 0.0;

            if (budget <= 100)
            {
                destination = "Bulgaria";
                if (season == "summer")
                {
                    savedMoney = budget * 0.3;
                    rest = "Camp";
                }
                else if (season == "winter")
                {
                    savedMoney = budget * 0.7;
                    rest = "Hotel";
                }
            }
            else if (budget <= 1000)
            {
                destination = "Balkans";
                if (season == "summer")
                {
                    savedMoney = budget * 0.4;
                    rest = "Camp";
                }
                else if (season == "winter")
                {
                    savedMoney = budget * 0.8;
                    rest = "Hotel";
                }
            }
            else if (budget > 1000)
            {
                destination = "Europe";
                if (season == "summer")
                {
                    savedMoney = budget * 0.9;
                    rest = "Hotel";
                }
                else if (season == "winter")
                {
                    savedMoney = budget * 0.9;
                    rest = "Hotel";
                }
            }

            //double moneySpent = budget - savedMoney;
            Console.WriteLine($"Somewhere in {destination}");
            Console.WriteLine($"{rest} - {savedMoney:f2}");
        }
    }
}
