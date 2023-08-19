#ifndef CUT_TRANSFORM_H
#define CUT_TRANSFORM_H

#include <cstring>
#include "TextTransform.h"

class CutTransform : public TextTransform
{
    std::string lastCut;

public:
    void invokeOn(std::string& text, int start, int end) override
    {
        std::string::iterator startInr = text.begin() + start;
        std::string::iterator endInr = text.begin() + end;

        this->lastCut = std::string(startInr, endInr);
        text.erase(startInr, endInr);
    }

    std::string getLastCut() { return this->lastCut; };
};

#endif