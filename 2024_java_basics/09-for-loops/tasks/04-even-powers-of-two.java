using System;

namespace _02_Numbers_N1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int num = 1;

            while (num <= n)
            {
                Console.WriteLine(num);
                num = num * 4; // Multiplies by 4 in each iteration
            }
        }
    }
}
