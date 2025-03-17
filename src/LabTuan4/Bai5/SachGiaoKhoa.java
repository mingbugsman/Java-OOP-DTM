package LabTuan4.Bai5;

public class SachGiaoKhoa extends Sach{
    private int edition;

    public SachGiaoKhoa(String bookId, String bookName, double cost, String author, int edition) {
        super(bookId, bookName, cost, author);
        this.edition = edition;

        setCost(cost > 300000 ? cost*0.8 : cost);
    }

    @Override
    public void display() {
        System.out.println("===================================");
        System.out.println("book id : " + getBookId());
        System.out.println("book name : " + getBookName());
        System.out.println("cost : " + getCost());
        System.out.println("author : " + getAuthor());
        System.out.println("edition : " + edition);
        System.out.println("===================================");
    }
}
