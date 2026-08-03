package baitap_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLyHang q1 = new QuanLyHang(new ArrayList<>());

        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Them hang thuc pham");
            System.out.println("2. Them hang dien may");
            System.out.println("3. Them hang sanh su");
            System.out.println("4. Xuat tat ca hang hoa");
            System.out.println("5. Xuat hang thuc pham");
            System.out.println("6. Xuat hang dien may");
            System.out.println("7. Xuat hang sanh su");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

            Hang h;

            switch (chon) {
                case 1:
                    h = new HangThucPham();
                    h.nhap(sc);

                    if (q1.them(h))
                        System.out.println("them thanh cong");
                    else
                        System.out.println("ma hang da ton tai");
                    break;
                case 2:
                    h = new HangDienMay();
                    h.nhap(sc);

                    if (q1.them(h))
                        System.out.println("them thanh cong");
                    else
                        System.out.println("ma hang da on tai");
                    break;
                case 3:
                    h = new HangSanhSu();
                    h.nhap(sc);

                    if (q1.them(h))
                        System.out.println("them thanh cong");
                    else
                        System.out.println("ma hang da ton tai");
                    break;
                case 4:
                    q1.xuatDanhSach();
                    break;
                case 5:
                    q1.xuatHangThucPham();
                    break;
                case 6:
                    q1.xuatHangDienMay();
                    break;
                case 7:
                    q1.xuatHangSanhSu();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("lua chon khong dung");
            }
        } while (chon != 0);
    }
}
