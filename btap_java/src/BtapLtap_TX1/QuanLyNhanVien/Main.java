package BtapLtap_TX1.QuanLyNhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVien> ds = new ArrayList<>();

        System.out.println("so lap trinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        ;

        for (int i = 0; i < n; i++) {
            LapTrinhVien x = new LapTrinhVien();
            x.nhap(sc);
            ds.add(x);
        }

        System.out.println("============ DANH SACH NHAN VIEN VUA NHAP ================");
        for (NhanVien x : ds)
            x.xuat();

        if (ds.size() > 0) {
            double max = ds.get(0).tinhLuong();

            for (NhanVien x : ds) {
                if (x.tinhLuong() > max)
                    max = x.tinhLuong();
            }
        } else {
            System.out.println("danh sach rong");
        }

        System.out.println("\n--- NHAN VIEN CO LUONG CAO NHAT ---");
        for (NhanVien x : ds) {
            if (x.tinhLuong() == max)
                x.xuat();
        }

        System.out.print("\nnhap ma nhan vien can tim kiem: ");
        String maNVTim = sc.nextLine();

        boolean timThay = false;

        System.out.println("--- KET QUA TIM KIEM ----");
        for (NhanVien x : ds) {
            if (x.getMaNV().equals(maNVTim)) {
                x.xuat();
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("khong tim thay nhan vien nao co ma " + maNVTim);
        }
    }
}
