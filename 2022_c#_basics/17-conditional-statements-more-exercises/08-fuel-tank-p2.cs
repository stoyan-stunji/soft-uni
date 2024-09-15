using System;

namespace _08_Fuel_Tank___Part_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string fuelType = Console.ReadLine();
            double litresFuel = double.Parse(Console.ReadLine());
            string card = Console.ReadLine();

            const string GAS = "Gas";
            const string GASOLINE = "Gasoline";
            const string DIESEL = "Diesel";
            const string YES = "Yes";
            const string NO = "No";
            double priceGas = 0.93;
            double priceGasoline = 2.22;
            double priceDiesel = 2.33;

            double priceGasNo = litresFuel * priceGas;
            double priceGasolineNo = litresFuel * priceGasoline;
            double priceDieselNo = litresFuel * priceDiesel;

            double price = 0.0;

            if (card == YES)
            {
                if (fuelType == GAS)
                {
                    double priceDiscountGas = priceGas - 0.08;
                    price = priceDiscountGas * litresFuel;
                }
                else if (fuelType == GASOLINE)
                {
                    double priceDiscountGasoline = priceGasoline - 0.18;
                    price = priceDiscountGasoline * litresFuel;
                }
                else if (fuelType == DIESEL)
                {
                    double priceDiscountDiesel = priceDiesel - 0.12;
                    price = priceDiscountDiesel * litresFuel;
                }
            }
            else if (card == NO)
            {
                if (fuelType == GAS)
                {
                    price = priceGasNo + 0;
                }
                else if (fuelType == GASOLINE)
                {
                    price = priceGasolineNo + 0;
                }
                else if (fuelType == DIESEL)
                {
                    price = priceDieselNo + 0;
                }
            }

            if (litresFuel < 20)
            {
                double finalPriceDiscount = price;
                Console.WriteLine($"{finalPriceDiscount:f2} lv.");
            }

            else if (litresFuel > 20 && litresFuel <= 25)
            {
                double finalPriceDiscount = price * 0.92;
                Console.WriteLine($"{finalPriceDiscount:f2} lv.");

            }
            else if (litresFuel > 25)
            {
                double finalPriceDiscount = price * 0.9;
                Console.WriteLine($"{finalPriceDiscount:f2} lv.");
            }

        }
    }
}
