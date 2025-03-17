package LabTuan4.Bai5;

public class SachVanHoc extends Sach{
    private String publisher;

    public SachVanHoc(String bookId, String bookName, double cost, String author, String publisher) {
        super(bookId, bookName, cost, author);
        this.publisher = publisher;

        setCost(publisher.equals("Giáo dục") ? cost*0.9 : cost);
    }

    @Override
    public void display() {
        System.out.println("===================================");
        System.out.println("book id : " + getBookId());
        System.out.println("book name : " + getBookName());
        System.out.println("cost : " + getCost());
        System.out.println("author : " + getAuthor());
        System.out.println("publisher : " + publisher);
        System.out.println("===================================");
    }
}
