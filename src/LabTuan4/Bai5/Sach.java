package LabTuan4.Bai5;

public abstract class Sach {
    private String bookId;
    private String bookName;
    private String author;
    private double cost;

    public Sach(String bookId, String bookName, double cost, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.cost = cost;
        this.author = author;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract void display();
}
