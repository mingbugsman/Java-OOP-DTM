package LabTuan2.Excercise.Bai4;

public class TaxHelper {
    public static double calculateTax(double price, int xiLang) {
        if (xiLang > 200) {
            return price*0.05;
        } else if (xiLang > 100) {
            return price*0.03;
        }
        return price*0.01;
    }
}


/*
* - Dưới 100cc, 1% trị giá xe.//50 10tr →expected: 100000
- Từ 100 đến 200cc, 3% trị giá xe.//100 10tr→expected, 150
- Trên 200cc, 5% trị giá xe.//250 10tr →expected
* */