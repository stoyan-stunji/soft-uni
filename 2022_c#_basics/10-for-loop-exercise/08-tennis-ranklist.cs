using System;

namespace _08_Tennis_Ranklist
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int tournaments = int.Parse(Console.ReadLine());
            int points = int.Parse(Console.ReadLine());

            int totalWinPoints = 0;
            int wins = 0;

            for (int tournament = 1; tournament <= tournaments; tournament++)
            {
                string stage = Console.ReadLine();
                switch (stage)
                {
                    case "W":
                        points += 2000;
                        totalWinPoints += 2000;
                        wins += 1;
                        break;
                    case "F":
                        points += 1200;
                        totalWinPoints += 1200;
                        break;
                    case "SF":
                        points += 720;
                        totalWinPoints += 720;
                        break;
                }
            }

            Console.WriteLine($"Final points: {points}");

            double average = totalWinPoints * 1.0 / tournaments;
            Console.WriteLine($"Average points: {Math.Floor(average)}");

            double wonToursPercent = wins * 1.0 / tournaments * 100;
            Console.WriteLine($"{wonToursPercent:f2}%");
        }
    }
}
