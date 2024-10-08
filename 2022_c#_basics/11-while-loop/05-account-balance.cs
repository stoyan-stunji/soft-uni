using System;

namespace _03_Sum_Numbers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string n = Console.ReadLine();
            double k = 0;

            while (n != "NoMoreMoney")
            {
                double n1 = double.Parse(n);

                if (n1 < 0)
                {
                    Console.WriteLine("Invalid operation!");
                    break;
                }

                Console.WriteLine($"Increase: {n1:f2}");
                k = k + n1;

                n = Console.ReadLine();
            }

            Console.WriteLine($"Total: {k:f2}");
        }
    }
}
