#ifndef PRINT_H
#define PRINT_H

#include <iostream>

template <class T>
void printVector(const std::vector<T>& vec)
{
    for(const T& value : vec)
    {
        std::cout << value << ' ';
    }
    std::cout << std::endl;
}







#endif