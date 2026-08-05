package BtapLtap_TX1.QuanLySanPham;

import java.util.Scanner;

public class DonHangKhuyenMai extends SanPham implements TinhTien {
    private int soLuongMua;
    private double tongTien;
    private double tiLeGiam;

    public DonHangKhuyenMai() {
    }

    public DonHangKhuyenMai(String maSP, String tenSP, double donGia, int soLuongMua) {
        super(maSP, tenSP, donGia);
        this.soLuongMua = soLuongMua;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("nhap so luong mua: ");
        soLuongMua = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void tinhTongTien() {
        tongTien = donGia * soLuongMua;
        tiLeGiam = 0;

        if (soLuongMua >= NGUONG_SO_LUONG) {
            tiLeGiam = (soLuongMua - NGUONG_SO_LUONG) * 0.01;

            if (tiLeGiam > KHUYEN_MAI_TOI_DA)
                tiLeGiam = KHUYEN_MAI_TOI_DA;
        }

        double tienGiam = tongTien*tiLeGiam;
        tongTien -= tienGiam;
    }


    @Override
    public void xuatHoaDon() {
        super.xuat();

        System.out.printf("%-15d %-15.0f\n",
                soLuongMua, tongTien);
    }

    public void xuatTieuDe() {
        System.out.printf("%-10s %-20s %-15s %-15s %-15s\n",
                "maSP", "tenSP", "don gia", "so luong mua", "tong tien");
    }

    public double getTongTien() {
        return tongTien;
    }
}
