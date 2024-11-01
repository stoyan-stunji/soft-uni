using System;

namespace _09_Left_and_Right_Sum
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int rows = int.Parse(Console.ReadLine());
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < 2 * rows; i++)
            {
                int number = int.Parse(Console.ReadLine());
                if (i < rows)
                {
                    leftSum += number;
                }
                else
                {
                    rightSum += number;
                }
            }

            if (leftSum == rightSum)
            {
                Console.WriteLine($"Yes, sum = {leftSum}");
            }
            else
            {
                Console.WriteLine($"No, diff = {Math.Abs(leftSum - rightSum)}");
            }
        }
    }
}
