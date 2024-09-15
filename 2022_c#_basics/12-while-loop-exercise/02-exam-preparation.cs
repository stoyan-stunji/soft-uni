using System;

namespace _02_Exam_Preparation
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double unsatisfyingProblemsNumber = double.Parse(Console.ReadLine());
            double unsatisfyingProblemsNumberCount = 0;
            double allProblems = 0;
            double avg = 0;
            string nameProblem = Console.ReadLine();

            string lastProblem = string.Empty;

            while (nameProblem != "Enough")
            {
                lastProblem = nameProblem;
                double ratingProblem = double.Parse(Console.ReadLine());
                avg += ratingProblem;
                allProblems += 1;

                if (ratingProblem <= 4)
                {
                    unsatisfyingProblemsNumberCount += 1;
                }

                if (unsatisfyingProblemsNumber == unsatisfyingProblemsNumberCount)
                {
                    Console.WriteLine($"You need a break, {unsatisfyingProblemsNumberCount} poor grades.");
                    break;
                }

                nameProblem = Console.ReadLine();
            }

            if (nameProblem == "Enough")
            {
                double averageScore = avg / allProblems;

                Console.WriteLine($"Average score: {averageScore:f2}");
                Console.WriteLine($"Number of problems: {allProblems}");
                Console.WriteLine($"Last problem: {lastProblem}");

            }
        }
    }
}
