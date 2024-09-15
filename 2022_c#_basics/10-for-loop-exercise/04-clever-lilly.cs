using System;

namespace _04_Clever_Lily
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int age = int.Parse(Console.ReadLine());
            double priceWashMachine = double.Parse(Console.ReadLine());
            int presentPrice = int.Parse(Console.ReadLine());

            double moneyBirthday = 0.0;
            double savedMoney = 0.0;
            int numberOfToys = 0;

            for (int currentYear = 1; currentYear <= age; currentYear++)
            {
             
                if (currentYear % 2 != 0)
                {
                    numberOfToys++;
                }
                else if (currentYear % 2 == 0)
                {
                    moneyBirthday += 10;
                    savedMoney += (moneyBirthday - 1);
                }
            }

            savedMoney += numberOfToys * presentPrice;

            if (savedMoney >= priceWashMachine)
            {
                double money = savedMoney - priceWashMachine;
                Console.WriteLine($"Yes! {money:f2}");
            }
            else
            {
                double money = priceWashMachine - savedMoney;
                Console.WriteLine($"No! {money:f2}");
            }
        }

    }
}
