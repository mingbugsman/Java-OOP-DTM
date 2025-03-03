package LabTuan2.Excercise.Bai5.BookManager.Manager;

import LabTuan2.Excercise.Bai5.BookManager.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookManager implements IManagerBook{
    public List<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }
    private Book findBook(String boCode) {
        return books.stream().filter(book -> Objects.equals(book.getBoCode(), boCode)).findFirst().orElse(null);
    }

    @Override
    public boolean addBook(Book book) {
        if (findBook(book.getBoCode()) != null) {
            return false;
        }
        books.add(book);
        return true;
    }

    @Override
    public boolean removeBook(String id) {
        if (findBook(id) == null) {
            return false;
        }
        Book book = findBook(id);
        books.remove(book);
        return true;
    }

    @Override
    public boolean updateBook(String boCode, Book requestUpdate) {
        if (findBook(requestUpdate.getBoCode()) == null) {
            return false;
        }
        Book foundBook = findBook(boCode);
        foundBook.setBoAuthor(requestUpdate.getBoAuthor());
        foundBook.setBoTitle(requestUpdate.getBoTitle());
        return true;
    }

    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Book getBook(String boCode) {
        return findBook(boCode);
    }
}
