using System;

namespace _06_Max_Number
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double maxN = int.MinValue;
            string n = Console.ReadLine();

            while (n != "Stop")
            {
                double n1 = double.Parse(n);

                if (n1 > maxN)
                {
                    maxN = n1; 
                }

                n = Console.ReadLine();
            }

            if (n == "Stop")
            {
                Console.WriteLine(maxN);
            }
        }
    }
}
