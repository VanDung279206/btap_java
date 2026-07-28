package baitap_6;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<NhanVien> ds = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            NhanVien nv = new NhanVien();
            System.out.println("nhập nhân viên thứ " + (i + 1) + "\n");

            System.out.println("mã nhân vien: ");
            nv.setMaNhanVien(sc.nextLine());

            System.out.println("nhập số sản phẩm: ");
            nv.setSoSanPham(Integer.parseInt(sc.nextLine()));

            ds.add(nv);
        }

        NhanVien.tieuDe();
        for (NhanVien nv : ds) {
            nv.inDL();
            System.out.println("vượt chuẩn: " + nv.coVuotChuan());
        }

    }
}
