using System;

namespace _03_Sum_Numbers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int firstInput = int.Parse(Console.ReadLine());
            int sum = 0;

            while (firstInput > sum)
            {
                int secondInput = int.Parse(Console.ReadLine());
                sum += secondInput;
            }

            Console.WriteLine(sum);
        }
    }
}
