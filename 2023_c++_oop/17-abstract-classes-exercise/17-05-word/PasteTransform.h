#ifndef PASTE_H
#define PASTE_H

#include <memory>
#include <string>
#include "TextTransform.h"
#include "CutTransform.h"

class PasteTransform : public TextTransform
{
    std::shared_ptr<CutTransform> cut;

public:
    PasteTransform(std::shared_ptr<CutTransform> cut) : cut(cut){}

    void invokeOn(std::string& text, int start, int end)
    {
        std::string::iterator startInr = text.begin() + start;
        std::string::iterator endInr = text.begin() + end;

        text.replace(startInr, endInr, this->cut->getLastCut());
    }
};

#endif