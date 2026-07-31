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

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public double getDiemTB() {
        return (diemLyThuyet + diemThucHanh) / 2;
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
    }

    //in tiêu đề
    public static void inTieuDe() {
        System.out.printf("%-20s %-20s %-25s %-25s %-25s %-20s\n",
                "mã sinh viên", "họ tên", "điểm lý thuyết", "điểm thực hành", "điểm trung bình", "kết quả");
    }

    //in dữ liệu
    public void inDuLieu(){
        String ketQua = getDiemTB() >= 5 ? "Đậu" : "Trượt";

        System.out.printf("%-20s %-20s %-25.2f %-25.2f %-25.2f %-20s\n",
                maSinhVien, hoTen, diemLyThuyet, diemThucHanh, getDiemTB(), ketQua);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
