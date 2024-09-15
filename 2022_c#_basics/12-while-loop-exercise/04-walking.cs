using System;

namespace _04_Walking
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int steps = 0;

            while (steps < 10000)
            {
                string input = Console.ReadLine();

                if (input == "Going home")
                {
                    int stepsHome = int.Parse(Console.ReadLine());
                    steps += stepsHome;
                    break;
                }
                else
                {
                    steps += int.Parse(input);
                }
            }

            if (steps >= 10000)
            {
                int dif = steps - 10000;
                Console.WriteLine($"Goal reached! Good job!");
                Console.WriteLine($"{dif} steps over the goal!");
            }
            else
            {
                int dif = 10000 - steps;
                Console.WriteLine($"{dif} more steps to reach goal.");
            }
        }
    }
}
