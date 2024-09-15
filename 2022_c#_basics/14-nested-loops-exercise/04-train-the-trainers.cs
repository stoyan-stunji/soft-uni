using System;

namespace _04.TrainTheTrainers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int people = int.Parse(Console.ReadLine());
            string presentation = Console.ReadLine();

            double avgScoreAll = 0;
            int counter = 0;

            while (presentation != "Finish")
            {
                double avgScore = 0;

                for (int i = 0; i < people; i++)
                {
                    double score = double.Parse(Console.ReadLine());

                    avgScore += score;
                    avgScoreAll += score;
                    counter++;
                }

                double avgScorePr = avgScore / people;

                Console.WriteLine($"{presentation} - {avgScorePr:F2}.");

                presentation = Console.ReadLine();
            }

            double assesment = avgScoreAll / counter;

            Console.WriteLine($"Student's final assessment is {assesment:F2}.");
        }
    }
}
