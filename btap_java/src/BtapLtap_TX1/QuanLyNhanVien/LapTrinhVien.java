package BtapLtap_TX1.QuanLyNhanVien;

import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
    private int soGioLamThem;

    public LapTrinhVien() {
    }

    public LapTrinhVien(String maNV, String hoTen, double luongCoBan, int soGioLamThem) {
        super(maNV, hoTen, luongCoBan);
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("nhap so gio lam: ");
        soGioLamThem = Integer.parseInt(sc.nextLine());
        ;
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf("%-10d",
                soGioLamThem);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + (soGioLamThem * 200000);
    }
}
