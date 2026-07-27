package baitap_5;

import java.util.Scanner;

public class NhanVien {
    private String hoDem;
    private String ten;
    private Ngay ngaySinh;
    private Ngay ngayVaoLam;

    Scanner sc = new Scanner(System.in);

    public NhanVien() {
        ngaySinh = new Ngay();
        ngayVaoLam = new Ngay();
    }

    //nhập
    public void nhap() {
        System.out.println("họ đệm: ");
        hoDem = sc.nextLine();

        System.out.println("tên: ");
        ten = sc.nextLine();

        System.out.println("nhập ngày sinh: ");
        ngaySinh.nhap();

        sc.nextLine();
        System.out.println("nhập ngày vào làm: ");
        ngayVaoLam.nhap();

        sc.nextLine();
    }

    // Xuất
    public void xuat() {

        System.out.println("\n===== THÔNG TIN NHÂN VIÊN =====");
        System.out.println("Họ tên: " + hoDem + " " + ten);

        System.out.print("Ngày sinh: ");
        ngaySinh.xuat();

        System.out.print("\nNgày vào làm: ");
        ngayVaoLam.xuat();

        System.out.println();
    }
}
