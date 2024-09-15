using System;

namespace _06_Oscars
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nameActor = Console.ReadLine();
            double pointsAcademy = double.Parse(Console.ReadLine());
            int numberOtzenqvasht = int.Parse(Console.ReadLine());

            for (int i = 1; i <= numberOtzenqvasht; i++)
            {
                string nameOtzenqvasht = Console.ReadLine();
                double pointsOtzenqvasht = double.Parse(Console.ReadLine());

                int nameOtzenqvashtLength = nameOtzenqvasht.Length;

                pointsAcademy = pointsAcademy + ((nameOtzenqvashtLength * 1.0 * pointsOtzenqvasht) / 2);

                if (pointsAcademy >= 1250.5)
                {
                    break;
                }

            }

            if (pointsAcademy >= 1250.5)
            {
                Console.WriteLine($"Congratulations, {nameActor} got a nominee for leading role with {pointsAcademy:f1}!");
            }
            else
            {
                double pointsNeeded = 1250.5 - pointsAcademy;
                Console.WriteLine($"Sorry, {nameActor} you need {pointsNeeded:f1} more!");
            }
        }
    }
}
