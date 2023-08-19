using System;

namespace _01_Pipes_In_Pool
{
    internal class Program
    {
        static void Main(string[] args)
        {
        int V = int.Parse(Console.ReadLine());
        int P1 = int.Parse(Console.ReadLine());
        int P2 = int.Parse(Console.ReadLine());
        double H = double.Parse(Console.ReadLine());

            double waterP1 = P1 * H;
            double waterP2 = P2 * H;
            double waterBoth = waterP1 + waterP2;

            if (waterBoth <= V)
            {
                double fullness = (waterBoth / V) * 100;
                double procentP1 = (waterP1 / waterBoth) * 100;
                double procentP2 = (waterP2 / waterBoth) * 100;
                Console.WriteLine($"The pool is {fullness:f2}% full. Pipe 1: {procentP1:f2}%. Pipe 2: {procentP2:f2}%.");
            }
            else 
            {
                double overFlow = waterBoth - V;
                Console.WriteLine($"For {H:f2} hours the pool overflows with {overFlow:f2} liters.");
            }
        }
    }
}
