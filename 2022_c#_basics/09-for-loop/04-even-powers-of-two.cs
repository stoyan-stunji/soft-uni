using System;

namespace _02_Numbers_N1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int num = 1;

            for (int value = 0; value <= n; value = value + 2)
            {
                Console.WriteLine(num);
                num = num * 2 * 2;
            }
        }
    }
}
