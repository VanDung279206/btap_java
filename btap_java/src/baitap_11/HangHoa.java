package baitap_11;

import java.util.Scanner;

public class HangHoa {
    // thuoc tinh
    private String tenHang;
    private double donGia;
    private int soLuong;

    //constructor

    public HangHoa() {
    }

    public HangHoa(String tenHang, double donGia, int soLuong) {
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getThanhTien() {
        return donGia + soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    // ham nhap
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("ten hang: ");
        tenHang = sc.nextLine();

        System.out.println("don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        System.out.println("so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    //ham xuat
    public void xuat() {
        System.out.printf("%-15s %-10.0f %-10d %-10.0f\n",
                tenHang, donGia, soLuong, getThanhTien());
    }
}
