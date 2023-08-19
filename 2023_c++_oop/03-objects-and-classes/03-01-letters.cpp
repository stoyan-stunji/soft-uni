#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <unordered_set>

//NOTE: 40/100

char toLowerCase(char c) 
{
    return std::tolower(static_cast<unsigned char>(c));
}

int main() 
{
    std::string text;
    std::getline(std::cin, text);

    std::vector<char> letters;
    while (true) 
    {
        std::string letter;
        std::getline(std::cin, letter);
        
        if (letter == ".")
            break;
            
        letters.push_back(letter[0]);
        
        if(letter >= "A" && letter <= "Z")
        {
            letters.push_back(toLowerCase(letter[0]));
        }
    }

    std::vector<std::string> words;
    std::string word;
    for (char c : text) 
    {
        if (std::isalpha(c)) 
        {
            word += c;
        } 
        else if (!word.empty()) 
        {
            words.push_back(word);
            word.clear();
        }
    }

    if (!word.empty()) 
    {
        words.push_back(word);
    }

    std::unordered_set<std::string> uniqueWords(words.begin(), words.end());
    words.assign(uniqueWords.begin(), uniqueWords.end());

    std::sort(words.begin(), words.end());

    for (char letter : letters) 
    {
        bool found = false;

        for (const std::string& word : words) 
        {
            if (word.find(letter) != std::string::npos) 
            {
                std::cout << word << " ";
                found = true;
            }
        }

        if (!found) 
        {
            std::cout << "---";
        }
        std::cout << std::endl;
    }

    return 0;
} 