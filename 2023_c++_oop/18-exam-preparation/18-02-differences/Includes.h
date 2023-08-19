#ifndef INCLUDES_H
#define INCLUDES_H

#include <vector>
#include <iostream>
#include <sstream>
#include "City.h"

class CityDiff
{
    City left;
    City right;

    public:
        CityDiff(const City& left, const City& right) : left(left), right(right){}

        std::string getDiff() const
        {
            std::ostringstream ostr;

            if(left.getName() == right.getName())
            {
                ostr << left.getName() << " (" << left.getCensusYear() << " vs. " 
                << right.getCensusYear() << ")";
            }
            else
            {
                ostr << left.getName() << " (" << left.getCensusYear() << ") vs. "
                << right.getName() << " (" << right.getCensusYear() << ")";
            }

            int popDiff = left.getPopulation() - right.getPopulation();
            ostr << '\n' << "population: ";

            if(popDiff >= 0)
            {
                ostr << '+' << popDiff << std::endl;
            }
            else if(popDiff < 0)
            {
                ostr << popDiff << std::endl;
            }

            return ostr.str();
        }

};

std::istream& operator>>(std::istream& istr, City& c)
{
    std::string name;
    size_t population;
    size_t year;

    istr >> name >> population >> year;

    c = City(year, name, population);

    return istr;
}

CityDiff operator-(const City& left, const City& right)
{
    return CityDiff(left, right);
}

std::ostream& operator<<(std::ostream& ostr, const CityDiff& c)
{
    ostr << c.getDiff();
    return ostr;
}

#endif