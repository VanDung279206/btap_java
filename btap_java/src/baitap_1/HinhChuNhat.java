package baitap_1;

import java.util.Scanner;

public class HinhChuNhat {
    static Scanner sc = new Scanner(System.in);
    static double cd, cr;

    public static void main(String[] args) {
        nhap();
        xuat();
    }

    // hàm nhập
    public static void nhap() {
        System.out.print("nhập chiều dài của HCN: ");
        cd = sc.nextDouble();
        System.out.print("nhập chiều rộng của HCN: ");
        cr = sc.nextDouble();
    }

    //hàm tính chu vi
    public static double tinhChuVi() {
        return (cd + cr) * 2;
    }

    //hàm tính diện tích
    public static double tinhDienTich() {
        return cd * cr;
    }

    // hàm xuất
    public static void xuat() {
        System.out.println("chiều dài : " + cd +
                "\nchiều rộng: " + cr +
                "\nchu vi: " + tinhChuVi() +
                "\ndiện tích: " + tinhDienTich());
    }
}
