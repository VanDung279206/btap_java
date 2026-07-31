package baitap_8;

import java.util.Map;
import java.util.Scanner;

public class HinhVuong extends HinhPhang {
    private double canh;

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh hình vuông: ");
        canh = sc.nextDouble();
    }

    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }

    @Override
    public double tinhDienTich() {
        return Math.pow(canh, 2);
    }

    @Override
    public void xuat() {
        System.out.println("======== HÌNH VUÔNG ========");
        System.out.println("cạnh: " + canh);
        System.out.println("chu vi: " + tinhChuVi());
        System.out.println("diện tích: " + tinhDienTich());
    }
}
