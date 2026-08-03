package baitap_12;

import java.util.Scanner;

public class HangDienMay extends Hang {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay() {
    }

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getthoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setthoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public double tinhVAT() {
        return donGia * soLuongTon * 0.1;
    }

    @Override
    public String danhGia() {
        if (soLuongTon < 3)
            return "ban duoc";
        return "khong danh gia";
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        do {
            System.out.println("nhap thoi gian bao hanh(thang): ");
            thoiGianBaoHanh = sc.nextInt();

            if (thoiGianBaoHanh < 0)
                System.out.println("thoi gian bao hanh > 0");

        } while (thoiGianBaoHanh < 0);

        do {
            System.out.println("nhap cong suat: ");
            congSuat = sc.nextDouble();

            if (congSuat <= 0)
                System.out.println("cong suat phai > 0");

        } while (congSuat <= 0);
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf(" %-10d %-10.2f\n",
                thoiGianBaoHanh, congSuat);
    }
}
