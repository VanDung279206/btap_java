package BtapLtap_TX1.QuanLyNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();

        System.out.println("so lap trinh vien: ");
        int n = Integer.parseInt(sc.nextLine());;

        for (int i = 0; i < n; i++) {
            LapTrinhVien x = new LapTrinhVien();
            x.nhap(sc);
            ds.add(x);
        }

        System.out.println("============ DANH SACH NHAN VIEN VUA NHAP ================");
        for(NhanVien x : ds)
            x.xuat();



        System.out.print("nhap ma nha vien can tim kiem: ");
        String maNVTim = sc.nextLine();

        // khong lam duoc phan tim kiem ma
    }
}
