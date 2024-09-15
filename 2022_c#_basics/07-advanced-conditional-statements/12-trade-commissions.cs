using System;

namespace _12_Trade_Commissions
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string town = Console.ReadLine();
            double s = double.Parse(Console.ReadLine());
            double commision = 0.0;

            switch (town)
            {
                case "Sofia":
                    if (s >= 0 && s <= 500)
                    {
                        commision = s * 5 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 500 && s <= 1000)
                    {
                        commision = s * 7 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 1000 && s <= 10000)
                    {
                        commision = s * 8 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 10000)
                    {
                        commision = s * 12 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s < 0)
                    {
                        Console.WriteLine("error");
                    }
                    break;

                case "Varna":
                    if (s >= 0 && s <= 500)
                    {
                        commision = s * 4.5 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 500 && s <= 1000)
                    {
                        commision = s * 7.5 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 1000 && s <= 10000)
                    {
                        commision = s * 10 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 10000)
                    {
                        commision = s * 13 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s < 0)
                    {
                        Console.WriteLine("error");
                    }
                    break;

                case "Plovdiv":
                    if (s >= 0 && s <= 500)
                    {
                        commision = s * 5.5 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 500 && s <= 1000)
                    {
                        commision = s * 8 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 1000 && s <= 10000)
                    {
                        commision = s * 12 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s > 10000)
                    {
                        commision = s * 14.5 / 100;
                        Console.WriteLine($"{commision:f2}");
                    }
                    else if (s < 0)
                    {
                        Console.WriteLine("error");
                    }
                    break;
                default:
                    {
                        Console.WriteLine("error");
                    }
                    break;
            }

        }
    }
}
