package Collection.QuanLyHinhTron;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so luong hinh tron: ");
        int n = Integer.parseInt(sc.nextLine());

        DSHinhTron ds = new DSHinhTron();

        // tao N hinh tron co ban kinh ngau nhien
        for (int i = 0; i < n; i++) {
            double banKinh = 1 + Math.random() * 9;

            HinhTron x = new HinhTron(banKinh);

            ds.themHinhTron(x);
        }

        //xuat danh sach
        System.out.println("\n============= DANH SACH HINH TRON ===============");

        for (int i = 0; i < ds.layKichThuoc(); i++) {
            System.out.println("Hinh Tron "+ (i + 1)+": "+ds.layHinhTron(i));

        }
    }
}
