using System;

namespace _05_Small_Shop_RE
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string product = Console.ReadLine();
            string town = Console.ReadLine();
            double quantity = double.Parse(Console.ReadLine());
            double totalSum = 0;

            switch (town)
            {
                case "Sofia":
                    switch (product)
                    {
                        case "coffee":
                            totalSum = quantity * 0.50;
                            Console.WriteLine(totalSum);
                        break;
                        case "water":
                            totalSum = quantity * 0.8;
                            Console.WriteLine(totalSum);
                        break;
                        case "beer":
                            totalSum = quantity * 1.20;
                            Console.WriteLine(totalSum);
                        break;
                        case "sweets":
                            totalSum = quantity * 1.45;
                            Console.WriteLine(totalSum);
                        break;
                        case "peanuts":
                            totalSum = quantity * 1.60;
                            Console.WriteLine(totalSum);
                        break;
                    }
                    break;
                case "Plovdiv":
                    switch (product)
                    {
                        case "coffee":
                            totalSum = quantity * 0.40;
                            Console.WriteLine(totalSum);
                            break;
                        case "water":
                            totalSum = quantity * 0.70;
                            Console.WriteLine(totalSum);
                            break;
                        case "beer":
                            totalSum = quantity * 1.15;
                            Console.WriteLine(totalSum);
                            break;
                        case "sweets":
                            totalSum = quantity * 1.30;
                            Console.WriteLine(totalSum);
                            break;
                        case "peanuts":
                            totalSum = quantity * 1.50;
                            Console.WriteLine(totalSum);
                            break;
                    }
                    break;
                case "Varna":
                    switch (product)
                    {
                        case "coffee":
                            totalSum = quantity * 0.45;
                            Console.WriteLine(totalSum);
                            break;
                        case "water":
                            totalSum = quantity * 0.70;
                            Console.WriteLine(totalSum);
                            break;
                        case "beer":
                            totalSum = quantity * 1.10;
                            Console.WriteLine(totalSum);
                            break;
                        case "sweets":
                            totalSum = quantity * 1.35;
                            Console.WriteLine(totalSum);
                            break;
                        case "peanuts":
                            totalSum = quantity * 1.55;
                            Console.WriteLine(totalSum);
                            break;
                    }
                    break;
            }
        }
    }
}
