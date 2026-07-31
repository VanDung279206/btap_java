package baitap_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<HoaDon> ds = new ArrayList<>();

        System.out.print("Nhap so hoa don: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\n1. Khach VN");
            System.out.println("2. Khach Nuoc Ngoai");

            System.out.print("Chon: ");
            int chon = sc.nextInt();

            HoaDon hd;

            if (chon == 1)
                hd = new KhachHangVietNam();
            else
                hd = new KhachHangNuocNgoai();

            hd.nhap();

            ds.add(hd);
        }

        System.out.println("\n===== DANH SACH HOA DON =====");

        for (HoaDon hd : ds)
            hd.xuat();

        double tongVN = 0;
        double tongNN = 0;

        double tongTienNN = 0;
        int demNN = 0;

        for (HoaDon hd : ds) {

            if (hd instanceof KhachHangVietNam)
                tongVN += hd.getSoLuong();

            if (hd instanceof KhachHangNuocNgoai) {

                tongNN += hd.getSoLuong();

                tongTienNN += hd.thanhTien();

                demNN++;
            }

        }

        System.out.println("\nTong so luong KH Viet Nam: " + tongVN);

        System.out.println("Tong so luong KH Nuoc Ngoai: " + tongNN);

        if (demNN != 0)
            System.out.println("Trung binh thanh tien KHNN = "
                    + tongTienNN / demNN);

        System.out.println("\n===== HOA DON THANG 09/2013 =====");

        for (HoaDon hd : ds)

            if (hd.getThang() == 9 && hd.getNam() == 2013)

                hd.xuat();

    }

}