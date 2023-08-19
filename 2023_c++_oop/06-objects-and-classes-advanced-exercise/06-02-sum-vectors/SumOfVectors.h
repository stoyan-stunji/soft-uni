#ifndef SUMOFVECTORS_H
#define SUMOFVECTORS_H
// Place your code here 

using namespace std;
#include <vector>
#include <string>

vector<string> operator+(const vector<string>& op1, const vector<string>& op2)
{
    vector<string> result;

    for (unsigned i = 0; i < op1.size(); i++)
    {
        result.push_back(op1[i] + " " + op2[i]);
    }
    
    return result;
}


#endif // !SUMOFVECTORS_H