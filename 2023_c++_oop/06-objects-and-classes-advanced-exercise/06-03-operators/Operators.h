#ifndef OPERATORS_H
#define OPERATORS_H
#include <ostream> 
#include <vector> 
#include <string> 
#include <sstream>

// Place your code here 

std::vector<std::string>& operator<<(std::vector<std::string>& vec, const std::string& str)
{
    vec.push_back(str);
    return vec;
}

std::string operator+(const std::string& str, const int& i)
{
    std::ostringstream ostr;
    ostr << str << i;
    return ostr.str();
}

std::ostream& operator<<(std::ostream& ostr, const std::vector<std::string>& vec)
{
    for(const std::string& cur : vec)
    {
        ostr << cur << std::endl;
    }
    return ostr;
}




#endif // !OPERATORS_H