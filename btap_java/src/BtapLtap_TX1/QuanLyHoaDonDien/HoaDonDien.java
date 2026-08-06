package BtapLtap_TX1.QuanLyHoaDonDien;

import java.util.Scanner;

public class HoaDonDien extends KhachHangDien implements TieuThu {
    private double chiSoCu;
    private double chiSoMoi;

    public HoaDonDien() {
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("nhap chi so cu: ");
        chiSoCu = sc.nextDouble();

        do {
            System.out.print("nhap vao chi so moi: ");
            chiSoMoi = sc.nextDouble();

            if (chiSoMoi < chiSoCu) {
                System.out.println("chi so moi khong duoc nho hon chi so cu");
            }
        } while (chiSoMoi < chiSoCu);
    }

    @Override
    public double tinhTienDien() {
        double soKW = chiSoMoi - chiSoCu;

        if (soKW <= 50) {
            return soKW * DON_GIA_BAC_1;
        } else {
            return (50 * DON_GIA_BAC_1) + ((soKW - 50) * DON_GIA_BAC_2);
        }
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf("%-10.0f %-10.0f %-15.0f\n",
                chiSoCu, chiSoMoi, tinhTienDien());
    }

    public static void xuatTieuDe() {
        System.out.printf("%-10s %-20s %-10s %-10s %-15s\n",
                "Ma KH", "Ten KH", "CS Cu", "CS Moi", "Tong Tien");
    }
}
