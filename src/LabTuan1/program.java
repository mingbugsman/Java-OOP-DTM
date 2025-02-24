package LabTuan1;

import LabTuan1.Excercise.*;

import java.util.Scanner;

public class program {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        execHelper(scanner);
    }

    public static void delayDot() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            Thread.sleep(1000);
        }
        System.out.println();
    }

    public static void execHelper(Scanner scanner) throws InterruptedException {


        while (true) {
            delayDot();
            displayInfo();
            System.out.print("Choose your option : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 :
                    Bai1 bai1 = new Bai1(scanner);
                    bai1.execBai1();
                    break;
                case 2 :

                    Bai2 bai2 = new Bai2(scanner);
                    bai2.execBai2();
                    break;

                case 3 :
                    Bai3 bai3 = new Bai3(scanner);
                    bai3.execBai3();
                    break;

                case 4 :
                    Bai4 bai4 = new Bai4(scanner);
                    bai4.execBai4();
                    break;

                case 5 :
                    Bai5 bai5 = new Bai5(scanner);
                    bai5.execBai5();
                    break;

                case 6 :
                    Bai6 bai6 = new Bai6(scanner);
                    bai6.ExecBai6();
                    break;

                case 7:
                    Bai7 bai7 = new Bai7(scanner);
                    bai7.execBai7();
                    break;

                case 8 :
                    Bai8 bai8 = new Bai8(scanner);
                    bai8.execBai8();
                    break;

                case 9 :
                    Bai9 bai9 = new Bai9(scanner);
                    bai9.execBai9();
                    break;

                case 10 :
                    Bai10 bai10 = new Bai10(scanner);
                    bai10.execBai10();
                    break;
                case 11 :
                    Bai11 bai11 = new Bai11(scanner);
                    bai11.execBai11();
                    break;

                case 12 :
                    Bai12 bai12 = new Bai12(scanner);
                    bai12.execBai12();
                    break;

                case 13 :
                    Bai13 bai13 = new Bai13(scanner);
                    bai13.execBai13();
                    break;

                case 14 :
                    Bai14 bai14 = new Bai14(scanner);
                    bai14.execBai14();
                    break;
                case 15:
                    Bai15 bai15 = new Bai15(scanner);
                    bai15.execBai15();
                case 0 :
                    return;
            }
        }

    }

    public static void displayInfo() {
        System.out.println("List exercise : ");
        System.out.println("""
                     \
                    0. Để hủy chương trình 
                    1. Viết chương trình in tên, ngày sinh, mã số sinh viên của bạn.
                    2. Viết chương trình tính diện tích hình chữ nhật với chiều cao và chiều rộng do người dùng
                    cung cấp.
                    3. Viết chương trình chuyển nhiệt độ từ độ F sang độ C. (oC = (oF - 32) / 1,8)
                    4. Viết chương trình để kiểm tra xem một năm có phải là năm nhuận hay không. (năm nhuận
                    chính xác là năm chia hết cho 4, ngoại trừ những năm chia hết cho 100, hoặc chia hết cho
                    400).
                    5. Viết chương trình tìm giá trị nhỏ nhất giữa ba số.
                    6. Viết chương trình nhập các cạnh của tam giác và kiểm tra xem tam giác có hợp lệ hay không.
                    7. Viết chương trình nhập điểm 5 môn Lý, Hóa, Sinh, Toán, Máy tính. Tính tỷ lệ phần trăm và
                    hạng như sau:
                    • Tỷ lệ> 90%: Hạng A
                    • Tỷ lệ> 80%: Hạng B
                    • Tỷ lệ> 70%: Hạng C
                    • Tỷ lệ> 60%: Hạng D
                    • Tỷ lệ> 40%: Hạng E
                    • Tỷ lệ phần trăm <40%: Hạng F
                    8. Viết hàm tìm chữ số đầu tiên và hàm tìm chữ số tận cùng của một số.
                    9. Viết hàm tính tổng các chữ số và hàm tính tích các chữ số của một số.
                    10. Viết hàm đếm số chữ số trong một số.
                    11. Viết hàm đảo ngược số nguyên đầu vào.
                    12. Viết một hàm để kiểm tra xem một số có phải là số đối xứng hay không.
                    
                    THỰC HÀNH LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG – HUYNH KÒM
                    
                    Học để chiến – học để kiểm cơm – học để nuôi ta & nuôi bồ Trang 3
                    
                    13. Viết chương trình nhập vào một chuỗi, đếm số từ trong chuỗi.
                    14. Viết chương trình nhập vào một chuỗi dạng Họ và Tên, tách riêng ra thành 3 phần Họ,
                    Tên, Tên đệm.
                    15. Viết chương trình nhập vào một ngày, tách ra riêng từng phần ngày, tháng và năm.""");

    }
}
