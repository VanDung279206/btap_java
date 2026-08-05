package BtapLtap_TX1.QuanLySanPham;

import java.util.Scanner;

public abstract class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double donGia;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
    }

    public void nhap(Scanner sc){
        System.out.print("nhap ma san pham: ");
        maSP = sc.nextLine();

        System.out.print("nhap ten san pham: ");
        tenSP = sc.nextLine();

        System.out.print("nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
    }

    public void xuat(){
        System.out.printf("%-10s %-20s %-16.0f",
                maSP, tenSP, donGia);
    }

    public String getMaSP() {
        return maSP;
    }
}
