package baitap_11;

import java.util.Scanner;

public class KhachHang {
    //thuộc tính
    private String tenKH;
    private String diaChi;

    //constructor

    public KhachHang() {
    }

    public KhachHang(String tenKH, String diaChi) {
        this.tenKH = tenKH;
        this.diaChi = diaChi;
    }

    //hàm nhập
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("tên khách hàng: ");
        tenKH = sc.nextLine();

        System.out.println("dia chi: ");
        diaChi = sc.nextLine();
    }

    //ham xuat
    public void xuat() {
        System.out.println("khach hang: " + tenKH + "\t\tDia chi: " + diaChi);
    }
}
