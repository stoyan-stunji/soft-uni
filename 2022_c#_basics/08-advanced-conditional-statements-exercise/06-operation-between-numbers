using System;

namespace _06_Operations_Between_Numbers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double n1 = int.Parse(Console.ReadLine());
            double n2 = int.Parse(Console.ReadLine());
            string operation = Console.ReadLine();

            double result = 0;
            double check = 0.0;

            switch (operation)
            {
                case "+":
                    result = n1 + n2;
                    check = result % 2;
                    if (check == 0)
                    {
                        Console.WriteLine($"{n1} + {n2} = {result} - even");
                    }
                    else if (check != 0)
                    {
                        Console.WriteLine($"{n1} + {n2} = {result} - odd");
                    }
                    break;

                case "-":
                    result = n1 - n2;
                    check = result % 2;
                    if (check == 0)
                    {
                        Console.WriteLine($"{n1} - {n2} = {result} - even");
                    }
                    else if (check != 0)
                    {
                        Console.WriteLine($"{n1} - {n2} = {result} - odd");
                    }
                    break;

                case "*":
                    result = n1 * n2;
                    check = result % 2;
                    if (check == 0)
                    {
                        Console.WriteLine($"{n1} * {n2} = {result} - even");
                    }
                    else if (check != 0)
                    {
                        Console.WriteLine($"{n1} * {n2} = {result} - odd");
                    }
                    break;
                case "/":
                    if (n2 == 0)
                    {
                        Console.WriteLine($"Cannot divide {n1} by zero");
                    }
                    else if (n2 != 0)
                    {
                        result = n1 / n2;
                        Console.WriteLine($"{n1} / {n2} = {result:f2}");
                    }
                    break;
                case "%":
                    if (n2 == 0)
                    {
                        Console.WriteLine($"Cannot divide {n1} by zero");
                    }
                    else if (n2 != 0)
                    {
                        result = n1 % n2;
                        Console.WriteLine($"{n1} % {n2} = {result}");
                    }
                    break;
            }
        }
    }
}
