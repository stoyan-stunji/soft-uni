#ifndef INPUT_H
#define INPUT_H

#include <iostream>
#include <map>
#include <sstream>
#include <string>

template <typename BookType>
void read(std::map<size_t, BookType>& books, std::istream& input)
{
	std::size_t book_id;
	std::cin >> book_id;
	books.emplace(book_id, std::cin);
}

template <typename BookType>
void print(const BookType& book, std::ostream& output)
{
	output << "book " << book.getId() << " \"" << book.getTitle() << "\" by " << book.getAuthor() << "is \"available\"";
}

template <typename BookType>
void borrow(BookType& book, const std::string& borrower)
{
	book.setBorrowed(borrower);
	std::cout << "book " << book.getId() << " \"" << book.getTitle() << "\" by " << book.getAuthor() << "is \"borrowed by " << book.getBorrower() << "\"";
}

template <typename T>
void borrow(T& book)
{
	book.setBorrowed("");
}

template<typename BookType>
void print(BookType book, std::ostream &output) {
	output << "book " << book.getId() << " \"" << book.getTitle() << "\" by " << book.getAuthor() << "is \"available\"";
}

template<template <class BookType> class MapPtrType, class BookType>
void print(MapPtrType<size_t, BookType> *m, std::ostream &output) {
	for (const auto &[id, book]: *m) {
		print<BookType>(book, output);
	}
}

#endif
