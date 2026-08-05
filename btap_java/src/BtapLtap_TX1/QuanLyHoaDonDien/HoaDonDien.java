package BtapLtap_TX1.QuanLyHoaDonDien;

import java.util.Scanner;

public class HoaDonDien extends KhachHangDien implements TieuThu{
    private double chiSoCu;
    private double chiSoMoi;

    public HoaDonDien() {
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("nhap chi so cu: ");
        chiSoCu = sc.nextDouble();

        System.out.print("nhap chi so moi: ");
        chiSoMoi = sc.nextDouble();
    }

    @Override
    public double tinhTienDien() {
        return 0;
    }
}
