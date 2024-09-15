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

            int difference = mArrivalSum - mExamSum;

            if (difference > 0)
            {
                if (difference < 60)
                {
                    Console.WriteLine("Late");
                    Console.WriteLine($"{difference} minutes after the start");
                }
                else
                {
                    int hours = difference / 60;
                    int minutes = difference % 60;
                    Console.WriteLine("Late");
                    Console.WriteLine($"{hours}:{minutes:D2} hours after the start");
                }
            }
            else if (difference == 0)
            {
                Console.WriteLine("On time");
            }
            else
            {
                difference = -difference; // Make it positive for easier handling

                if (difference <= 30)
                {
                    Console.WriteLine("On time");
                    if (difference != 0)
                    {
                        Console.WriteLine($"{difference} minutes before the start");
                    }
                }
                else
                {
                    if (difference < 60)
                    {
                        Console.WriteLine("Early");
                        Console.WriteLine($"{difference} minutes before the start");
                    }
                    else
                    {
                        int hours = difference / 60;
                        int minutes = difference % 60;
                        Console.WriteLine("Early");
                        Console.WriteLine($"{hours}:{minutes:D2} hours before the start");
                    }
                }
            }
        }
    }
}
