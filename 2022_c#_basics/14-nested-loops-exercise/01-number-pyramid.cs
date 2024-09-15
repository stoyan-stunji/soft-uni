using System;

namespace _01._Number_Pyramid
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());

            int number = 1;
            bool isBigger = false;

            for (int rows = 1; rows <= n; rows++)
            {
                for (int colums = 1; colums <= rows; colums++)
                {
                    if (number > n)
                    {
                        isBigger = true;
                        break;
                    }

                    Console.Write(number + " ");
                    number++;
                }

                if (isBigger)
                {
                    break;
                }

                Console.WriteLine();
            }
        }
    }
}
