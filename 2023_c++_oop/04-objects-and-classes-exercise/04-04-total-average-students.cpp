#include <sstream>
#include <vector>
#include <string>
#include <map>
#include <iostream>
#include <iomanip>
#include <list>
#include <cmath>

using namespace std;

class Student
{
private:
    string name;
    string surname; 
    double average;

public:
    Student(const string name, const string surname, const double average)
    {
        this->name = name;
        this->surname = surname;
        this->average = average;
    }

    void print() const 
    {
        cout << name << " " << surname << " " << average;
        cout << '\n';
    }

    const double getAverage() const { return this->average; };
};

typedef vector<Student> Students;

int main()
{
    int numStudents;
    cin >> numStudents;

    if(numStudents <= 0)
    {
        cout << "Invalid input\n";
        return 0;
    }

    Students students;

    while(numStudents)
    {
        string name;
        string surname; 
        double average;

        cin >> name >> surname >> average;

        students.push_back(Student(name, surname, average));
        numStudents--;
    }

    double sumAverage = 0;

    for(const Student& stud : students)
    {
        stud.print();
        sumAverage += stud.getAverage();
    }

    cout << sumAverage / students.size() << '\n';
}