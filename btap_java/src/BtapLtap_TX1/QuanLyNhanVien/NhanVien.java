package BtapLtap_TX1.QuanLyNhanVien;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }

    public void nhap(Scanner sc) {
        System.out.print("nhap ma nhan vien: ");
        maNV = sc.nextLine();

        System.out.print("nhap ho ten nhan vien: ");
        hoTen = sc.nextLine();

        System.out.print("nhap luong co ban: ");
        luongCoBan = Double.parseDouble(sc.nextLine());
        ;
    }

    public void xuat() {
        System.out.printf("%-10s %-15s %-10f %-10f\n",
                maNV, hoTen, luongCoBan, tinhLuong());

    }

    public abstract double tinhLuong();

    public String getMaNV() {
        return maNV;
    }
}
