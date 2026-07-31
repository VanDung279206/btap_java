package baitap_9;

import java.util.Scanner;

public class KhachHangVietNam extends HoaDon {
    private String doiTuong;
    private double dinhMuc;

    @Override
    public void nhap() {
        super.nhap();

        Scanner sc = new Scanner(System.in);

        System.out.print("đối tượng (Sinh hoạt/ Kinh doanh/ Sản xuất: )");
        doiTuong = sc.nextLine();

        System.out.println("định mức: ");
        dinhMuc = sc.nextDouble();
    }

    @Override
    public double thanhTien() {
        if (soLuong <= dinhMuc)
            return soLuong * donGia;
        return dinhMuc * donGia + (soLuong - dinhMuc) * donGia * 2.5;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("%-15s %-10.2f",
                doiTuong, dinhMuc);
    }
}
