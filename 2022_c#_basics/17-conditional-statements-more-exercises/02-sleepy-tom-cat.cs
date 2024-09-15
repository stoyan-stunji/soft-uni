using System;

namespace _02_Sleepy_Tom_Cat
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int restDays = int.Parse(Console.ReadLine());

            int minutesRestDays = restDays * 127;
            int workDays = 365 - restDays;
            int minutesWorkDays = workDays * 63;

            int minutesCombined = minutesWorkDays + minutesRestDays;

            if (30000 > minutesCombined)
            { 
                int minutesLeft = 30000 - minutesCombined;
                Console.WriteLine($"Tom sleeps well");
                double H = minutesLeft / 60;
                double M = minutesLeft % 60;
                Console.WriteLine($"{H} hours and {M} minutes less for play");
            }
            else
            {
                int minutesNeeded = minutesCombined - 30000;
                Console.WriteLine($"Tom will run away");
                double H = minutesNeeded / 60;
                double M = minutesNeeded % 60;
                Console.WriteLine($"{H} hours and {M} minutes more for play");
            }

        }
    }
}
