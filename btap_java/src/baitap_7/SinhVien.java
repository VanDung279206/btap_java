package baitap_7;

import java.util.Scanner;

public class SinhVien {

    private String maSinhVien;
    private String hoTen;
    private double diemLyThuyet;
    private double diemThucHanh;
    Scanner sc = new Scanner(System.in);

    public SinhVien() {
        maSinhVien = " ";
        hoTen = " ";
        diemLyThuyet = 0;
        diemThucHanh = 0;
    }

    public SinhVien(String maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    public void nhap() {
        System.out.println("nhập mã sinh viên: ");
        maSinhVien = sc.nextLine();

        System.out.println("nhập tên sinh viên: ");
        hoTen = sc.nextLine();

        System.out.println("nhập điểm lý thuyết: ");
        diemLyThuyet = Double.parseDouble(sc.nextLine());

        System.out.println("nhập điểm thực hành: ");
        diemThucHanh = Double.parseDouble(sc.nextLine());

        double dtb = (diemLyThuyet + diemThucHanh) / 2;
        System.out.println("điểm trung bình của sinh viên " + hoTen + " là: " + dtb);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
