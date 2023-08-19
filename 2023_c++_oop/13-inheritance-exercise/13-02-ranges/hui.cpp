#include <iostream>
#include <vector>
#include <sstream>
#include <algorithm>
#include <iterator>

int main() {
    std::vector<std::pair<int, int>> ranges;
    int number = 0;
    std::string line;

    int from, to;
    while (std::getline(std::cin, line) && line != ".") {
        std::istringstream ss(line);
        ss >> from >> to;
        ranges.emplace_back(from, to);
    }

    std::vector<int> checkNumbers;
    while (std::getline(std::cin, line) && line != ".") {
        std::istringstream ss(line);
        ss >> number;
        checkNumbers.push_back(number);
    }

    for (const int checkNumber : checkNumbers) {
        bool isIn = false;

        int left = 0;
        int right = ranges.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (checkNumber < ranges[mid].first) {
                right = mid - 1;
            } else if (checkNumber > ranges[mid].second) {
                left = mid + 1;
            } else {
                isIn = true;
                break;
            }
        }

        std::cout << (isIn ? "in" : "out") << '\n';
    }

    return 0;
}