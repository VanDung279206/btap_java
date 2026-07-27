package baitap_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<PhuongTien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    //nhập danh sách
    public static void nhapDanhSach() {
        System.out.print("nhập số lượng xe: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n xe thứ " + (i + 1));

            System.out.print("tên chủ xe: ");
            String ten = sc.nextLine();

            if (ten.trim().isEmpty())
                break;

            System.out.print("loại xe: ");
            String loai = sc.nextLine();

            System.out.print("dung tích xi lanh: ");
            int dt = Integer.parseInt(sc.nextLine());

            System.out.print("Trị giá xe: ");
            double gia = Double.parseDouble(sc.nextLine());

            ds.add(new PhuongTien(ten, loai, dt, gia));
        }
    }

    // tiêu đề
    public static void tieuDe() {
        System.out.printf("%-20s %-20s %-10s %-15s %-15s\n",
                "Tên Chủ Xe", "Loại Xe", "Xi Lanh", "Trị Giá", "Thuế");
    }

    //in danh sách
    public static void inDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }

        tieuDe();

        for (PhuongTien pt : ds) {
            pt.xuat();
        }
    }

    //bảng thuế
    public static void bangThue() {
        System.out.println("\nBẢNG KÊ KHAI THUẾ");

        tieuDe();

        for (PhuongTien pt : ds) {
            pt.xuat();
        }
    }

    //sắp xếp
    public static void sapXep() {
        Collections.sort(ds, Comparator.comparing(PhuongTien::getTenChuXe));

        System.out.println("đã sắp xếp theo tên chủ xe");
    }

    //xe có thuế lớn nhất
    public static void thueLonNhat() {
        if (ds.isEmpty()) {
            System.out.println("danh sách rỗng");
            return;
        }

        PhuongTien max = ds.get(0);

        for (PhuongTien pt : ds) {
            if (pt.tinhThue() > max.tinhThue()) {
                max = pt;
            }
        }

        System.out.println("\nxe có thuế lơn nhất: ");

        tieuDe();

        max.xuat();
    }

    public static void menu() {
        while (true) {
            System.out.printf("\n %15s\n", "MENU");
            System.out.println("1. Nhập danh sách xe");
            System.out.println("2. In danh sách xe");
            System.out.println("3. Xuất bảng kê khai thuế");
            System.out.println("4. Sắp xếp theo tên chủ xe");
            System.out.println("5. Xe có thuế lớn nhất");
            System.out.println("0. Thoát");

            System.out.println("Chọn: ");
            int chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    nhapDanhSach();
                    break;
                case 2:
                    inDanhSach();
                    break;
                case 3:
                    bangThue();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    thueLonNhat();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("lựa chọn không đúng");
            }

        }
    }
}
