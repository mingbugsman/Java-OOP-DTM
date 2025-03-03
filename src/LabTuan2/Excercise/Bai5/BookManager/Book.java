package LabTuan2.Excercise.Bai5.BookManager;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {}

    public Book(String boAuthor, String boTitle, String boCode) {
        this.boAuthor = boAuthor;
        this.boTitle = boTitle;
        this.boCode = boCode;
    }

    public String getBoCode() {
        return boCode;
    }

    public void setBoCode(String boCode) {
        this.boCode = boCode;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    public void setBoAuthor(String boAuthor) {
        this.boAuthor = boAuthor;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }
}
