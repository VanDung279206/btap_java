package BtapLtap_TX1.QuanLyNhanVienSales;

import java.util.Scanner;

public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected static final double luongCung = 5000000;

    public NhanVien() {
    }

    public void nhap(Scanner sc){
        System.out.print("nhap ma nhan vien: ");
        maNV = sc.nextLine();

        System.out.print("nhap ten nhan vien: ");
        tenNV = sc.nextLine();
    }

    public void xuat(){
        System.out.printf("%-10s %-20s",
                maNV, tenNV);
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }
}
