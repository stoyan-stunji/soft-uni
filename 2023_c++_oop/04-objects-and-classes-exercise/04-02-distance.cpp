#include <iostream>
#include <cmath>
#include <iomanip>

class Point
{
private:
    int x;
    int y;

public:
    Point()
    {
        this->x = 0;
        this->y = 0;
    }

    Point(const int x, const int y)
    {
        this->x = x;
        this->y = y;
    }

    void setX(const int x)
    {
        this->x = x;
    }

    void setY(const int y)
    {
        this->y = y;
    }

    float getDist(const int secondX, const int secondY)
    {
        return sqrt(((secondX - this->x) * (secondX - this->x)) + ((secondY - this->y) * (secondY - this->y)));
    }
};

const bool isIntegral(float number)
{
    return (number - static_cast<int>(number)) == 0;
}

int main()
{
    Point first;
    int x1;
    std::cin >> x1;
    int y1;
    std::cin >> y1;

    first.setX(x1);
    first.setY(y1);

    int x2;
    std::cin >> x2;
    int y2;
    std::cin >> y2;

    if(isIntegral(first.getDist(x2, y2)))
    {
        std::cout << first.getDist(x2, y2) << ".000";
    }
    else
    {
        std::cout << std::fixed << std::setprecision(3) << first.getDist(x2, y2);
    }
}