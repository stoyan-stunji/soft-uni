#include <iostream>
#include <string>
#include <vector>

//NOTE: 60/100

struct Location {
    std::string name;
    double latitude;
    double longitude;
};

bool isEqual(double a, double b) {
    // Compare two floating-point numbers with a small tolerance
    double epsilon = 0.000001;
    return std::abs(a - b) < epsilon;
}

int main() {
    std::vector<Location> locations;

    // Read locations
    std::string input;
    while (std::getline(std::cin, input) && input != ".") {
        size_t comma_pos = input.find(',');
        size_t second_comma_pos = input.find(',', comma_pos + 1);

        std::string name = input.substr(0, comma_pos);
        double latitude = std::stod(input.substr(comma_pos + 1, second_comma_pos - comma_pos - 1));
        double longitude = std::stod(input.substr(second_comma_pos + 1));

        locations.push_back({name, latitude, longitude});
    }

    // Process queries
    while (std::getline(std::cin, input) && input != ".") {
        bool found = false;

        if (input.find(',') != std::string::npos) {
            // Query is in the format of latitude,longitude
            size_t comma_pos = input.find(',');
            double latitude = std::stod(input.substr(0, comma_pos));
            double longitude = std::stod(input.substr(comma_pos + 1));

            for (const Location& loc : locations) {
                if (isEqual(loc.latitude, latitude) && isEqual(loc.longitude, longitude)) {
                    std::cout << loc.name << "," << loc.latitude << "," << loc.longitude << std::endl;
                    found = true;
                }
            }
        } else {
            // Query is the name of a location
            for (const Location& loc : locations) {
                if (loc.name == input) {
                    std::cout << loc.name << "," << loc.latitude << "," << loc.longitude << std::endl;
                    found = true;
                }
            }
        }

        if (!found) {
            std::cout << "No matching location found." << std::endl;
        }
    }

    return 0;
}