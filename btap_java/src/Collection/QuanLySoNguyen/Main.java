package Collection.QuanLySoNguyen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLySoNguyen q1 = new QuanLySoNguyen();

        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhap danh sach so nguyen");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Tim kiem gia tri");
            System.out.println("4. Xuat cac so nguyen to");
            System.out.println("5. Sap xep bang Collections");
            System.out.println("6. Xoa mot gia tri");
            System.out.println("0. Thoat");
            System.out.println("==========================");

            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    q1.nhap(sc);
                    break;
                case 2:
                    q1.xuat();
                    break;
                case 3:
                    System.out.print("nhap gia tri can tim: ");
                    int x = Integer.parseInt(sc.nextLine());
                    q1.timKiem(x);
                    break;
                case 4:
                    q1.xuatSoNguyenTo();
                    break;
                case 5:
                    q1.sapXep();
                    break;
                case 6:
                    System.out.print("nhap gia tri can xoa: ");
                    int y = Integer.parseInt(sc.nextLine());
                    q1.xoa(y);
                    break;
                case 0:
                    System.out.println("ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("lua chon khong hop le");
            }
        } while (chon != 0);
    }
}
