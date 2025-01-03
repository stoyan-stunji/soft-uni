using System;

namespace _03.SumPrimeNonPrime
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string input = Console.ReadLine();

            int sumPrime = 0;
            int sumNotPrime = 0;
                       
            while (input != "stop")
            {
                int n = int.Parse(input);
                int prime = 0;

                if (n < 0)
                {
                    Console.WriteLine("Number is negative.");

                    input = Console.ReadLine();
                    continue;
                }

                if (n == 0)
                {
                    input = Console.ReadLine();
                    continue;
                }

                for (int i = 1; i <= n; i++)
                {
                    if (n % i == 0)
                    {
                        prime++;
                    }
                }

                if (prime == 2)
                {
                    sumPrime += n;
                }
                else
                {
                    sumNotPrime += n;
                }

                input = Console.ReadLine();
            }

            Console.WriteLine($"Sum of all prime numbers is: {sumPrime}");
            Console.WriteLine($"Sum of all non prime numbers is: {sumNotPrime}");
        }
    }
}
