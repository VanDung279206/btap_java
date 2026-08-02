package baitap_10;

import java.util.Scanner;

public class NhanVienVP extends NhanVien{
    private double mucLuong;
    private int ngayNghi;

    @Override
    public void nhap() {
        super.nhap();

        Scanner sc = new Scanner(System.in);

        System.out.println("mức lương: ");
        mucLuong = sc.nextDouble();

        System.out.println("số ngày nghỉ: ");
        ngayNghi = sc.nextInt();
    }

    @Override
    public double tinhLuong() {
        return mucLuong - ngayNghi * 10000;
    }
}
