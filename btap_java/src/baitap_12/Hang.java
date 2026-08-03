package baitap_12;

import java.util.Scanner;

public abstract class Hang {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public Hang() {
    }

    public Hang(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    //kh co get ma hang vi khong duoc sua

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void nhap(Scanner sc){
        do{
            System.out.println("Nhap ma hang: ");
            maHang = sc.nextLine();

            if(maHang.trim().length() == 0)
                System.out.println("ma hang khong duoc rong");

        }while (maHang.trim().length() == 0);

        do{
            System.out.println("nhap ten hang: ");
            tenHang = sc.nextLine();

            if(tenHang.trim().length() == 0)
                System.out.println("ten hang khong duoc de trong");

        }while (tenHang.trim().length() == 0);

        do{
            System.out.println("nhap so luong ton: ");
            soLuongTon = sc.nextInt();

            if(soLuongTon < 0)
                System.out.println("so luong ton phai >= 0");
        }while (soLuongTon < 0);

        do{
            System.out.println("nhap vao don gia: ");
            donGia = sc.nextDouble();

            if(donGia <= 0)
                System.out.println("don gia phai lon hon 0");
        }while (donGia <= 0);
    }

    public void xuat(){
        System.out.printf("%-10s %-20s %-10d %-12.0f %-10.0f %-15s",
                maHang, tenHang, soLuongTon, donGia, tinhVAT(), danhGia());
    }

    public abstract double tinhVAT();

    public abstract String danhGia();
}
