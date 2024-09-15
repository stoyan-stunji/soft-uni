using System;

namespace _03_Histogram
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int numberGroups = int.Parse(Console.ReadLine());

            int musala = 0;
            int monblan = 0;
            int kilimanjaro = 0;
            int ktwo = 0;
            int everest = 0;

            for (int i = 1; i <= numberGroups; i++)
            {
                int people = int.Parse(Console.ReadLine());

                if (people <= 5)
                {
                    musala += people;
                }
                else if (people >= 6 && people <= 12)
                {
                    monblan += people;
                }
                else if (people >= 13 && people <= 25)
                {
                    kilimanjaro += people;
                }
                else if (people >= 26 && people <= 40)
                {
                    ktwo += people;
                }
                else if (people >= 41)
                {
                    everest += people;
                }
            }

            int peopleAll = musala + monblan + kilimanjaro + ktwo + everest;

            double percentMusala = musala * 1.0 / peopleAll * 100;
            double percentMonblan = monblan * 1.0 / peopleAll * 100;
            double percentKilimanjaro = kilimanjaro * 1.0 / peopleAll * 100;
            double percentKtwo = ktwo * 1.0 / peopleAll * 100;
            double percentEverest = everest * 1.0 / peopleAll * 100;

            Console.WriteLine($"{percentMusala:f2}%");
            Console.WriteLine($"{percentMonblan:f2}%");
            Console.WriteLine($"{percentKilimanjaro:f2}%");
            Console.WriteLine($"{percentKtwo:f2}%");
            Console.WriteLine($"{percentEverest:f2}%");

        }
    }
}
