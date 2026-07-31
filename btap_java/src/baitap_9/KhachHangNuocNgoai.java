package baitap_9;

import java.util.Scanner;

public class KhachHangNuocNgoai extends HoaDon {
    private String quocTich;

    @Override
    public void nhap() {
        super.nhap();

        Scanner sc = new Scanner(System.in);

        System.out.print("sước tịch: ");
        quocTich = sc.nextLine();
    }

    @Override
    public double thanhTien() {
        return soLuong * donGia;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-15s\n", quocTich);
    }
}
