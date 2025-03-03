package LabTuan2.Excercise.Bai5.BookManager.Manager;

import LabTuan2.Excercise.Bai5.BookManager.Book;

import java.util.List;

public interface IManagerBook {
    boolean addBook(Book book);
    boolean removeBook(String id);
    boolean updateBook(String boCode, Book requestUpdate);
    List<Book> getAll();
    Book getBook(String id);
}
