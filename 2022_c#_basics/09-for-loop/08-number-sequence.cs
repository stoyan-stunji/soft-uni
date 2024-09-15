using System;

namespace _08_Number_sequence
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int maxNum = int.MinValue;
            int minNum = int.MaxValue;

            int rows = int.Parse(Console.ReadLine());

            for (int i = 0; i < rows; i++)
            {
                int number = int.Parse(Console.ReadLine());
                if (number > maxNum)
                {
                    maxNum = number;
                }

                if (number < minNum)
                {
                    minNum = number;
                }
            }

            Console.WriteLine($"Max number: {maxNum}");
            Console.WriteLine($"Min number: {minNum}");

        }
    }
}
