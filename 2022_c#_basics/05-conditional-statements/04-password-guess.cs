using System;

namespace _04_Password_Guess
{
    internal class Program
    {
        static void Main(string[] args)
        {

            string input = Console.ReadLine();
            const string PASSWORD = "s3cr3t!P@ssw0rd";
            if (input == PASSWORD)
            {
                Console.WriteLine("Welcome");
            }
            else
            { Console.WriteLine("Wrong password!");
            }
        }
    }
}
