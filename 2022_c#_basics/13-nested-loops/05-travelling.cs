using System;

namespace _05_Travelling
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string destination = Console.ReadLine();

            while (destination != "End")
            {
                double budget = double.Parse(Console.ReadLine());
                double savedMoney = double.Parse(Console.ReadLine());

                while (savedMoney < budget)
                {
                    savedMoney += double.Parse(Console.ReadLine());
                }

                Console.WriteLine($"Going to {destination}!");
                
                destination = Console.ReadLine();
            }
        }
    }
}
