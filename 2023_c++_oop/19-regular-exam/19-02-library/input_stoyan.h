#ifndef INPUT_H
#define INPUT_H

#include <iostream>
#include <string>
#include <sstream>
#include <map>

const int toInt(const std::string& a)
{
    int i;
    std::istringstream(a) >> i;
    return i;
}

template<typename T>
void read(std::map<size_t, T>& books, std::istream& input) 
{

}

template<typename T>
void print(const T& book, std::ostream& output) 
{
   book.getId();
}

template<typename T>
void borrow(T& book, const std::string& borrower) 
{
   
}

template<typename T>
void borrow(T& book) 
{
    book.setBorrowed("");
}

template<typename T>
void print(const map<size_t, T>* books, std::ostream& output) 
{
    
}

#endif