package BtapLtap_TX1.QuanLySachThuVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Sach {
    //thuoc tinh
    private String maSach;
    private String tenSach;
    private double giaTien;
    private TacGia tg;

    public Sach() {
        this.tg = new TacGia();
    }

    public Sach(String maSach, String tenSach, double giaTien, TacGia tg) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.giaTien = giaTien;
        this.tg = tg;
    }

    public void nhap(Scanner sc) {
        System.out.print("nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.println("nhap gia tien: ");
        giaTien = Double.parseDouble(sc.nextLine());

        System.out.println("------ NHAP THONG TIN TAC GIA -------");
        tg.nhap(sc);

    }

    public boolean ktraGia() {
        return giaTien > 100000;
    }

    public void hienThiThongTinSach() {
        System.out.printf("%-10s %-20s %-15.0f",
                maSach, tenSach, giaTien);

        tg.hienThiThongTinTacGia();
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public TacGia getTg() {
        return tg;
    }

    public void setTg(TacGia tg) {
        this.tg = tg;
    }


}
