#include <sstream>
#include <vector>
#include <string>
#include <map>
#include <iostream>
#include <iomanip>
#include <list>
#include <cmath>

using namespace std;

class Sale
{
private:
    std::string city;
    std::string product;
    double price;
    double quantity;

public:
    Sale(std::istream& istr);

    const string getCity() const { return this->city; };
    const string getPorduct() const { return this->product; };
    const double getPrice() const { return this->price; };
    const double getQuantity() const { return this->quantity; };
};

Sale::Sale(std::istream& istr)
{
    istr >> city >> product >> price >> quantity;
}

typedef std::list<Sale> SalesList;
typedef map<string, double> SalesSumary;

int main()
{
    SalesList sales;

    size_t salesNum;
    std::cin >> salesNum;
    while(salesNum)
    {
        Sale sale(cin);
        sales.push_back(sale);
        salesNum--;
    }

    SalesSumary ssum;
    for(const Sale & s : sales)
    {
        ssum[s.getCity()] += s.getPrice() * s.getQuantity();
    }

    for(const pair<string, double> & curCity : ssum)
    {
        std::cout << fixed << setprecision(2) << curCity.first << " -> " << curCity.second << endl;
    }
}