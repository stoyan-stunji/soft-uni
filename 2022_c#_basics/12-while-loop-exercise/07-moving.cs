using System;

namespace _07_Moving
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int w = int.Parse(Console.ReadLine());
            int l = int.Parse(Console.ReadLine());
            int h = int.Parse(Console.ReadLine());
            int homeSpace = h * l * w;
            string input = Console.ReadLine();

            while (input != "Done")
            {
                int box = int.Parse(input);
                homeSpace -= box;

                if (homeSpace <= 0)
                {
                    int dif = Math.Abs(homeSpace);
                    Console.WriteLine($"No more free space! You need {dif} Cubic meters more.");
                    break;
                }

                input = Console.ReadLine();
            }

            if (homeSpace > 0)
            {
                Console.WriteLine($"{homeSpace} Cubic meters left.");
            }
        }
    }
}
