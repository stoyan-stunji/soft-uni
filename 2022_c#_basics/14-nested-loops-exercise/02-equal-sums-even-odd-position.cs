using System;

namespace _02_Equal_Sums_Even_Odd_Position
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n1 = int.Parse(Console.ReadLine());
            int n2 = int.Parse(Console.ReadLine());

            for (int i = n1; i <= n2; i++)
            {
                string number = i.ToString();
                int evenSum = 0;
                int oddSum = 0;
                
                for (int j = 0; j < number.Length; j++)
                {
                    int digit = int.Parse(number[j].ToString());

                    if (j % 2 == 0)
                    {
                        evenSum += digit;
                    }
                    else
                    {
                        oddSum += digit;
                    }
                }

                if (evenSum == oddSum)
                {
                    Console.Write($"{i} ");
                }
                
            }

            
        }
    }
}
