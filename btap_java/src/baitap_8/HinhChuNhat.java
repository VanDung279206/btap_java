package baitap_8;

import java.util.Scanner;

public class HinhChuNhat extends HinhPhang {
    //thuộc tính
    private double dai;
    private double rong;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập chiều dài hình chữ nhật: ");
        dai = sc.nextDouble();

        System.out.print("nhập chiều rộng hình chữ nhật: ");
        rong = sc.nextDouble();
    }

    @Override
    public double tinhChuVi() {
        return (dai + rong) / 2;
    }

    @Override
    public double tinhDienTich() {
        return (dai * rong);
    }

    @Override
    public void xuat() {
        System.out.println("======== HÌNH CHỮ NHẬT =======");
        System.out.println("chiều dài: " + dai);
        System.out.println("chiều rộng: " + rong);
        System.out.println("chu vi: " + tinhChuVi());
        System.out.println("diện tích: " + tinhDienTich());
    }
}
