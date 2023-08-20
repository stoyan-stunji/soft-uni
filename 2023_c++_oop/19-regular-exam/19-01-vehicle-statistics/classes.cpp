#include "classes.h"

void Vehicle::printInfo(ostream & output)
{
    output << numberPlate << ", " << color;

    if(this->getSize() == "S")
    {
        output << " with 2 wheels.";
    }

    if(this->getSize() == "M")
    {
        output << " medium car.";
    }

    if(this->getSize() == "L")
    {
        output << " bigger car.";
    }

    if(this->getSize() == "XL")
    {
        output << " truck.";
    }

    if(this->getSize() == "XXL")
    {
        output << " big truck.";
    }
}