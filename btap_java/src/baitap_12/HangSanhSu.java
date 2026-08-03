package baitap_12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HangSanhSu extends Hang {
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;

    public HangSanhSu() {
    }

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, LocalDate ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.println("nhap nha san xuat: ");
        nhaSanXuat = sc.nextLine();

        int d, m, y;

        System.out.println("nhap ngay nhap kho");

        System.out.println("ngay: ");
        d = sc.nextInt();

        System.out.println("thang: ");
        m = sc.nextInt();

        System.out.println("nam: ");
        y = sc.nextInt();

        ngayNhapKho = LocalDate.of(y, m, d);
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf(" %-20s %-15s\n",
                nhaSanXuat, ngayNhapKho);
    }

    @Override
    public double tinhVAT() {
        return donGia * soLuongTon * 0.1;
    }

    @Override
    public String danhGia() {
        long soNgay = ChronoUnit.DAYS.between(ngayNhapKho, LocalDate.now());

        if(soLuongTon > 50 && soNgay > 10)
            return "ban cham";
        return "khong danh gia";
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
}
