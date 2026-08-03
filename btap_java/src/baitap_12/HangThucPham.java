package baitap_12;

import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham extends Hang {
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private String nhaCungCap;

    public HangThucPham() {

    }

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        int d, m, y;

        System.out.println("nhap ngay san xuat");

        System.out.println("ngay: ");
        d = sc.nextInt();

        System.out.println("thang: ");
        m = sc.nextInt();

        System.out.println("nam: ");
        y = sc.nextInt();

        ngaySanXuat = LocalDate.of(y, m, d);

        do {
            System.out.println("nhap nga het han");

            System.out.println("ngay: ");
            d = sc.nextInt();

            System.out.println("thang: ");
            m = sc.nextInt();

            System.out.println("nam: ");
            y = sc.nextInt();

            ngayHetHan = LocalDate.of(y, m, d);

            if (ngayHetHan.isBefore(ngaySanXuat))
                System.out.println("ngay het han phai sau ngay san xuat");

        } while (ngayHetHan.isBefore(ngaySanXuat));

        sc.nextLine();

        System.out.println("nhap nha cung cap: ");
        nhaCungCap = sc.nextLine();
    }


    @Override
    public double tinhVAT() {
        return donGia * soLuongTon * 0.05;
    }

    @Override
    public String danhGia() {
        if (soLuongTon > 0 && LocalDate.now().isAfter(ngayHetHan))
            return "kho ban";

        return "khong danh gia";
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf(" %-12s %-12s %-20s\n",
                ngaySanXuat, ngayHetHan, nhaCungCap);
    }
}
