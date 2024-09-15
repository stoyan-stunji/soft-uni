using System;

namespace _06_Cake
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int l = int.Parse(Console.ReadLine());
            int w = int.Parse(Console.ReadLine());
            double cake = l * w;
            double pieces = 0.0;

            while (cake > 0)
            {
                string input = Console.ReadLine();

                if (input == "STOP")
                {
                    break;
                }

                int takenPieces = int.Parse(input);
                cake -= takenPieces;
            }

            if (cake >= 0)
            {
                Console.WriteLine($"{cake} pieces are left.");
            }
            else
            {
                Console.WriteLine($"No more cake left! You need {Math.Abs(cake)} pieces more.");
            }
        }
    }
}
