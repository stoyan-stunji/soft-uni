using System;

namespace _04_Sum_of_Two_Numbers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());
            int n3 = int.Parse(Console.ReadLine());

            int check = 0;
            bool isN3 = false;

            for (int i = n1; i <= n2; i++)
            {
                for (int j = n1; j <= n2; j++)
                {
                    check++;

                    if (i + j == n3)
                    {
                        isN3 = true;
                        Console.WriteLine($"Combination N:{check} ({i} + {j} = {n3})");
                        break;
                    }
                }

                if(isN3)
                {
                    break;
                }
            }

            if (!isN3)
            {
                Console.WriteLine($"{check} combinations - neither equals {n3}");
            }
        }
    }
}
