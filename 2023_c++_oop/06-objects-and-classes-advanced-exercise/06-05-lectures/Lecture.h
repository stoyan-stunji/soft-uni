#ifndef LECTURE_H
#define LECTURE_H

#include "Resource.h"
#include "ResourceType.h"
#include <map>
#include <algorithm>

namespace SoftUni
{
    class Lecture
    {
        private:
            map<int, Resource> resource;
            std::map<ResourceType, int> resourcesByType;

        public:
            class It
            {
                private:
                    map<int, Resource>::iterator it;

                public:
                    It(map<int, Resource>::iterator it)
                    {
                        this->it = it;
                    }

                It& operator++() { ++it; return *this; };
                const bool operator!= (const It& other) const { return this->it != other.it; };

                Resource& operator*() { return it->second; };
            };

            It begin() { return It(resource.begin()); };
            It end() { return It(resource.end()); };

            Lecture& operator<<(const Resource& r)
            {
                auto it = resource.find(r.getId());
                ResourceType prevType = ResourceType::VIDEO;
                if(it != resource.end())
                {
                    prevType = it->second.getType();
                }

                resource[r.getId()] = r;

                if(it != resource.end())
                {
                    resourcesByType[prevType]--;

                    if(resourcesByType[prevType] == 0)
                    {
                        resourcesByType.erase(prevType);
                    }
                }

                resourcesByType[r.getType()]++;

                return *this;
            }    

            
        void initResourceType(std::vector<ResourceType>& res)
        {
            res.clear();
            for(auto& cur : resourcesByType)
            {
                res.push_back(cur.first);
            }
        }

        const int operator[](const ResourceType& r)
        {
            return resourcesByType[r];
        }
    };


    void operator<<(std::vector<ResourceType>& res, Lecture& l)
    {
        l.initResourceType(res);
    }

}


#endif // !LECTURE_H