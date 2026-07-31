package baitap_8;

import java.util.Scanner;

public class HinhTron extends HinhPhang {
    private double banKinh;


    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập bán kính: ");
        banKinh = sc.nextDouble();
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }

    @Override
    public void xuat() {
        System.out.println("======== HÌNH TRÒN ========");
        System.out.println("bán kính: " + banKinh);
        System.out.println("chu vi: " + tinhChuVi());
        System.out.println("diện tích: " + tinhDienTich());
    }
}
