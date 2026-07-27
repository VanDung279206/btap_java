package baitap_2;

import java.util.Scanner;

public class HinhTron {
    static double r;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhap();
        xuat();
    }

    //hàm nhập
    public static void nhap() {
        System.out.print("nhập bán kính hình tròn: ");
        r = sc.nextDouble();
    }

    //hàm tính chu vi hình tròn
    public static double tinhChuVi() {
        return 2 * Math.PI * r;
    }

    //hàm tính diện tích hình tròn
    public static double tinhDienTich() {
        return Math.PI * Math.pow(r, 2);
    }

    //hàm xuất
    public static void xuat() {
        System.out.println("bán kính: " + r +
                "\nchu vi: " + tinhChuVi() +
                "\ndiện tích: " + tinhDienTich());
    }
}
