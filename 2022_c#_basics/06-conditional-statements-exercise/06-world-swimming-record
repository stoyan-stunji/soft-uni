using System;

namespace _06_World_Swimming_Record
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double worldRecord = double.Parse(Console.ReadLine());
            double distanceMetres = double.Parse(Console.ReadLine());
            double timeSecondsForMeter = double.Parse(Console.ReadLine());

            double distanceToSwimInSeconds = distanceMetres * timeSecondsForMeter;
            double waterResistance = Math.Floor(distanceMetres / 15);
            double addedTime = waterResistance * 12.5;

            double finalTime = distanceToSwimInSeconds + addedTime;

            if (finalTime < worldRecord)
            {
                Console.WriteLine($"Yes, he succeeded! The new world record is {finalTime:f2} seconds.");

            }
            else
            {
                double neededSeconds =  finalTime - worldRecord;
                Console.WriteLine($"No, he failed! He was {neededSeconds:f2} seconds slower.");
            }
        }
    }
}
