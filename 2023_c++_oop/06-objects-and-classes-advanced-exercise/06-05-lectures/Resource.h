#ifndef RESOURCE_H
#define RESOURCE_H
#include "ResourceType.h"
// Place your code here 

using namespace std;
#include <string>
namespace SoftUni {

class Resource
{
private:
    int id;
    ResourceType type;
    std::string link;

public:
    Resource()
    {
        this->id = 0;
        this->type = ResourceType::PRESENTATION;
        this->link = ' ';
    }
    Resource(const int id, const ResourceType type, const std::string link)
    {
        this->id = id;
        this->type = type;
        this->link = link;
    }

    const int getId() const { return this->id; };
    const ResourceType getType() const { return this->type; };
    const std::string getLink() const { return this->link; };

    const bool operator<(const Resource& other) const
    {
        return this->id < other.id;
    }

    friend istream& operator>>(istream& istr, Resource& res)
    {
        string resType;

        istr >> res.id >> resType >> res.link;

        if(resType == "Presentation")
        {
            res.type = ResourceType::PRESENTATION;
        }
        else if(resType == "Demo")
        {
            res.type = ResourceType::DEMO;
        }
        else
        {
            res.type = ResourceType::VIDEO;
        }
        
        return istr;
    }

    friend ostream& operator<<(ostream& ostr, const Resource& res)
    {
        ostr << res.getId() << " " << res.getType() << " " << res.getLink();


        return ostr;
    }
};

}




#endif // !RESOURCE_H