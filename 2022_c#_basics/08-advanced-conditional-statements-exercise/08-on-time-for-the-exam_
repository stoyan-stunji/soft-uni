using System;

namespace _08_On_Time_for_the_Exam
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int hExam = int.Parse(Console.ReadLine());
            int mExam = int.Parse(Console.ReadLine());
            int hArrival = int.Parse(Console.ReadLine());
            int mArrival = int.Parse(Console.ReadLine());

            int mExamSum = (hExam * 60) + mExam;
            int mArrivalSum = (hArrival * 60) + mArrival;

            if (mArrivalSum > mExamSum)
            {

                if (mArrivalSum - mExamSum < 60)
                {
                    Console.WriteLine($"Late");
                    Console.WriteLine($"{mArrivalSum - mExamSum} minutes after the start");
                }
                else if (mArrivalSum - mExamSum > 60)
                {
                    Console.WriteLine($"Late");
                    double h = (mArrivalSum - mExamSum) / 60;
                    double m = (mArrivalSum - mExamSum) % 60;
                    if (m < 10)
                    {
                        Console.WriteLine($"{h}:0{m} hours after the start");
                    }
                    else
                    {
                        Console.WriteLine($"{h}:{m} hours after the start");
                    }
                }
            }

            else if (mArrivalSum == mExamSum)
            {
                Console.WriteLine($"On time");
            }

            else if (mExamSum - mArrivalSum <= 30)
            {
                if (mExamSum - mArrivalSum != 0)
                {
                    Console.WriteLine($"On time");
                    Console.WriteLine($"{mExamSum - mArrivalSum} minutes before the start");
                }
            }

            else if (mExamSum - mArrivalSum > 30)
            {
                Console.WriteLine($"Early");

                if (mExamSum - mArrivalSum < 60)
                {
                    Console.WriteLine($"{mExamSum - mArrivalSum} minutes before the start");
                }
                else
                {
                    int h = (mExamSum - mArrivalSum) / 60;
                    int m = (mExamSum - mArrivalSum) % 60;
                    if (m < 10)
                    {
                        Console.WriteLine($"{h}:0{m} hours before the start");
                    }
                    else
                    {
                        Console.WriteLine($"{h}:{m} hours before the start");
                    }
                }
            }

        }

    }
}
// 93 от 100, има грешка някъде

