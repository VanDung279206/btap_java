package BtapLtap_TX1.QuanLyHoaDonDien;

import java.util.Scanner;

public abstract class KhachHangDien {
    protected String maKH;
    protected String tenKH;

    public KhachHangDien() {
    }

    public void nhap(Scanner sc) {
        System.out.print("nhap ma khach hang: ");
        maKH = sc.nextLine();

        System.out.print("nhap ten khach hang: ");
        tenKH = sc.nextLine();

    }

    public void xuat() {
        System.out.printf("%-10s %-20s",
                maKH, tenKH);
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getMaKH() {
        return maKH;
    }
}
