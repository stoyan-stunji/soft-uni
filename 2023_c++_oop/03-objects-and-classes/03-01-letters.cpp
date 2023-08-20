// curEl.erase(remove_if(curEl.begin(), curEl.end(), ::ispunct), curEl.end());
 
#include <iostream>
#include <string>
#include <sstream>
#include <memory>
#include <algorithm>
#include <cctype>
#include <vector>
#include<set>
#include <ctype.h>
 
using namespace std;
 
 
int main()
{
    vector<string> allWords;
 
    string line;
    getline(cin, line);
 
    istringstream istr(line);
    string curEl;
 
    while (istr >> curEl)
    {
      curEl.erase(remove_if(curEl.begin(), curEl.end(), ::ispunct), curEl.end());
      allWords.push_back(curEl);
    }
 
    char letter;
    cin >> letter;
    cin.ignore();
 
    while (letter != '.')
    {
        set<string> forPrint;
 
 
        for (size_t i = 0; i < allWords.size(); i++)
        {
            string originalWord = allWords[i];
            string testCopy = originalWord;
 
            string* upperWord = &testCopy;
 
 
            transform(upperWord->begin(), upperWord->end(), upperWord->begin(), ::toupper);
 
 
            char upperSym = toupper(letter);
 
            size_t found = testCopy.find_first_of(upperSym);
 
            if (found != std::string::npos)
            {
                forPrint.insert(originalWord);
            }
 
        }
 
        if (forPrint.empty())
        {
            cout << "---" << endl;
 
        }
        else
        {
            set<string>::iterator itr;
 
            for (itr = forPrint.begin(); itr != forPrint.end(); itr++)
            {
                cout << *itr << " ";
            }
 
            cout << endl;
 
        }
 
 
        cin >> letter;
        cin.ignore();
    }
 
 
    cout << endl;
 
    return 0;
}
