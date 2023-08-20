#ifndef INPUT_H
#define INPUT_H
 
#include <iostream>
#include <sstream>
#include <map>
 
template <typename T>
void read(std::map<size_t, Book>& books, std::istream& iStream)
{
    std::string input;
    iStream >> input;
    std::istringstream iStr(input);
 
    size_t id;
    iStr >> id;
 
    while (input != "end") {
        std::istringstream iStr(input);
        iStr >> id;
 
        iStream.ignore();
 
        Book book = Book(id, iStream);
        books[id] = book;
 
        iStream >> input;
    }
}
 
template <typename T>
void print(Book& b, std::ostream& oStream)
{
    oStream << "book " << b.getId() << " \"" << b.getTitle()
        << "\" by \"" << b.getAuthor() << "\" ";
 
    if (b.getBorrower() == "")
    {
        oStream << "is \"available\"";
    }
    else
    {
        oStream << "is \"borrowed by " << b.getBorrower() << "\"";
    }
    oStream << std::endl;
}
 
template <typename T>
void print(const std::map<size_t, Book>* books, std::ostream& oStream)
{
    oStream << "-----" << std::endl << "total books: " 
        << books->size() << std::endl;
    
    for (const auto& b : *books)
    {
        //print<Book>(b.second, oStream);
 
        oStream << "book " << b.second.getId() << " \"" << b.second.getTitle()
            << "\" by \"" << b.second.getAuthor() << "\" ";
 
        if (b.second.getBorrower() == "")
        {
            oStream << "is \"available\"";
        }
        else
        {
            oStream << "is \"borrowed by " << b.second.getBorrower() << "\"";
        }
 
        oStream << std::endl;
    }   
}
 
template <typename T>
void borrow(Book& b, std::string& borrower)
{
    b.setBorrowed(borrower);
 
    print<Book>(b, std::cout);
}
 
template <typename T>
void borrow(Book& b)
{
    b.setBorrowed("");
 
    print<Book>(b, std::cout);
}
 
#endif // !INPUT_H