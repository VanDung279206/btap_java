package baitap_10;

import java.time.Year;
import java.util.Scanner;

public abstract class NhanVien {
    protected String hoTen;
    protected int namVaoLam;

    // hàm nhập
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("họ tên: ");
        hoTen = sc.nextLine();

        System.out.println("năm vào làm: ");
        namVaoLam = sc.nextInt();
    }

    // lương của từng loại nhân viên
    public abstract double tinhLuong();

    //phụ cấp
    public double tinhPhuCap() {
        int soNam = Year.now().getValue() - namVaoLam;
        return 100000 + soNam * 20000;
    }

    //tổng tiền
    public double tongLuong() {
        return tinhLuong() + tinhPhuCap();
    }

    // hàm xuất
    public void xuat() {
        System.out.printf("%-20s %-8d %-12.0f %-12.0f %-12.0f\n",
                hoTen, namVaoLam, tinhLuong(), tinhPhuCap(), tongLuong());
    }
}
