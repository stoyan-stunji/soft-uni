#ifndef CITY_UTILS_H
#define CITY_UTILS_H

#include <vector>
#include <map>
#include "City.h"

const City* initCity(const std::string& name, size_t population) 
{
    return new City(name, population);
}

std::map<size_t, const City*> groupByPopulation(const std::vector<const City*>& cities, size_t& totalPopulation) 
{
    std::map<size_t, const City*> citiesByPopulation;
    totalPopulation = 0;

    for (const City* city : cities) 
    {
        size_t population = city->getPopulation();
        citiesByPopulation[population] = city;
        totalPopulation += population;
    }

    return citiesByPopulation;
}


#endif