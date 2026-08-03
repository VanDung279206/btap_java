package BtapLtap_TX1.QuanLyThueBao;

import java.util.Scanner;

public class ThueBaoTheoDungLuong extends ThueBao implements NhapXuat {
    private double duongLuong;

    public ThueBaoTheoDungLuong() {
    }

    public ThueBaoTheoDungLuong(String maThueBao, String tenChuThueBao, String diaChi, double duongLuong) {
        super(maThueBao, tenChuThueBao, diaChi);
        this.duongLuong = duongLuong;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("nhap dung luong su dung: ");
        duongLuong = Double.parseDouble(sc.nextLine());

    }

    public double tinhCuocPhi() {
        double tongTien = TIEN_THUE_BAO + (duongLuong * 40);
        if (tongTien > MUC_TRAN)
            return MUC_TRAN;
        return tongTien;
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf("%-20.1f %-20.0f\n",
                duongLuong, tinhCuocPhi());
    }
}
