#ifndef CAR_H
#define CAR_H
// Place your code here

#include <string>
using namespace std;

class Car
{
private:
    std::string brand;
    std::string model;
    int year;

public:
    Car();
    Car(const std::string brand, const std::string model, const int year)
    {
        this->brand = brand;
        this->model = model;
        this->year = year;
    }

    const std::string GetBrand() const { return this->brand; };
    const std::string GetModel() const { return this->model; };
    const int GetYear() const { return this->year; };
};












#endif // !CAR_H
