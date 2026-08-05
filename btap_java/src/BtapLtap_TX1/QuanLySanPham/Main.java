package BtapLtap_TX1.QuanLySanPham;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<DonHangKhuyenMai> ds = new ArrayList<>();

        System.out.print("nhap so don hang: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("----- Don Hang Thu " + (i + 1) + " -------");
            DonHangKhuyenMai x = new DonHangKhuyenMai();
            x.nhap(sc);
            x.tinhTongTien();
            ds.add(x);
        }

        DonHangKhuyenMai dh = new DonHangKhuyenMai();
        System.out.println("===== DANH SACH DON HANG ======");
        dh.xuatTieuDe();
        for (DonHangKhuyenMai x : ds) {
            x.xuatHoaDon();
        }

        System.out.println("\n====== DANH SACH SAU KHI SAP XEP =====");
        dh.xuatTieuDe();
        ds.sort(new Comparator<DonHangKhuyenMai>() {
            @Override
            public int compare(DonHangKhuyenMai o1, DonHangKhuyenMai o2) {
                return Double.compare(o2.getTongTien(), o1.getTongTien());
            }
        });

        for (DonHangKhuyenMai x : ds) {
            x.xuatHoaDon();
        }

        System.out.println("\n========== TIM KIEM DANH SACH =========");
        boolean timThay = false;

        System.out.print("nhap vao ma san pham: ");
        String maCanTim = sc.nextLine();

        for (DonHangKhuyenMai x : ds) {
            if (x.getMaSP().equals(maCanTim)) {
                timThay = true;
                dh.xuatTieuDe();
                x.xuatHoaDon();
                break;
            }
        }

        if (!timThay) {
            System.out.println("khong co ma san pham nao nhu vay");
        }
    }
}
