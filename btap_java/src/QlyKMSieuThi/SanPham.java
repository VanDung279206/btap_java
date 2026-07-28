package QlyKMSieuThi;

import java.util.Scanner;

public class SanPham {

    protected String maSanPham;
    protected String tenSanPham;
    protected double donGia;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, double donGia) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã sản phẩm: ");
        maSanPham = sc.nextLine();

        System.out.println("nhập tên sản phẩm: ");
        tenSanPham = sc.nextLine();

        System.out.println("nhập đơn giá: ");
        donGia = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println("mã sản phẩm: " + maSanPham);
        System.out.println("tên sản phẩm: " + tenSanPham);
        System.out.println("đơn giá: " + donGia);
    }
}
