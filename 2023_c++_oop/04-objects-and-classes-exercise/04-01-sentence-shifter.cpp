#include <sstream>
#include <vector>
#include <map>
#include <iostream>
using namespace std;

typedef vector<string> WordsVector;

class Shifter
{
private:
    WordsVector words;

public:
    Shifter(const WordsVector& words) { this->words = words; }  

    void shift(size_t times);  
    const WordsVector& getShiftedSentence(void);
};

const WordsVector& Shifter::getShiftedSentence(void) { return words; }

void Shifter::shift(size_t times)
{
    while(times)
    {
        string lastWord = words[words.size() - 1];
        words.pop_back();
        words.insert(words.begin(), lastWord);
        times--;
    }
}

int main()
{
    WordsVector words;
    string buffer;
    getline(cin, buffer);
    istringstream istr(buffer);

    string word;
    while(istr >> word)
    {
        words.push_back(word);
    }

    int shits;
    cin >> shits;

    Shifter s(words);
    s.shift(shits);

    const WordsVector& shifted = s.getShiftedSentence();
    for (auto word : shifted)
    {
        cout << word;
        std::cout << '\n';
    }
    
}