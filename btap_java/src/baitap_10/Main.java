package baitap_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<NhanVien> ds = new ArrayList<>();

        System.out.println("nhập số nhân viên: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("1. Nhan vien san xuat");
            System.out.println("2. Nhan vien van phong");

            System.out.print("chọn: ");
            int chon = sc.nextInt();

            NhanVien nv;

            if (chon == 1) {
                nv = new NhanVienSX();
            } else {
                nv = new NhanVienVP();
            }

            nv.nhap();

            ds.add(nv);
        }

        System.out.println("========== DANH SÁCH NHÂN VIÊN ==========");

        System.out.printf("%-20s %-8s %-12s %-12s %-12s\n",
                "họ tên", "năm", "lương", "phụ cấp", "tổng");

        double tongTien = 0;

        for (NhanVien x : ds) {
            x.xuat();
            tongTien += x.tongLuong();
        }

        System.out.println("tổng tiền công ty phải trả mỗi tháng = " + tongTien);
    }

}
