package baitap_9;

import java.util.Scanner;

public abstract class HoaDon {
    //thuộc tính
    protected String maKH;
    protected String hoTen;
    protected int ngay;
    protected int thang;
    protected int nam;
    protected double soLuong;
    protected double donGia;

    //constructor
    public HoaDon() {
    }

    //phương thức nhập
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("mã khách hàng: ");
        maKH = sc.nextLine();

        System.out.print("họ tên: ");
        hoTen = sc.nextLine();

        System.out.print("ngày: ");
        ngay = Integer.parseInt(sc.nextLine());

        System.out.print("tháng: ");
        thang = Integer.parseInt(sc.nextLine());

        System.out.print("năm: ");
        nam = Integer.parseInt(sc.nextLine());

        System.out.print("số lượng: ");
        soLuong = Double.parseDouble(sc.nextLine());

        System.out.print("đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
    }

    public abstract double thanhTien();

    public void xuat() {
        System.out.printf("%-10s %-20s %2d/%2d/%4d %-10.2f %-10.2f",
                maKH, hoTen, ngay, thang, nam, soLuong, donGia, thanhTien());
    }

    //getter và setter

    public double getSoLuong() {
        return soLuong;
    }

    public int getThang() {
        return thang;
    }

    public int getNam() {
        return nam;
    }
}
