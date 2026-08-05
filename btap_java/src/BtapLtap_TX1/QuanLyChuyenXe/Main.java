package BtapLtap_TX1.QuanLyChuyenXe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ChuyenXeLienTinh cx = new ChuyenXeLienTinh();

        ArrayList<ChuyenXeLienTinh> ds = new ArrayList<>();

        System.out.print("nhap so chuyen xe: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            ChuyenXeLienTinh x = new ChuyenXeLienTinh();

            System.out.println("---------- nhap thong tin xe thu " + (i + 1) + " -----------");
            x.nhap(sc);
            ds.add(x);
        }

        System.out.println("=========== DANH SACH CHUYEN XE =============");
        cx.xuatTieuDe();
        for (ChuyenXeLienTinh x : ds) {
            x.xuat();
        }

        System.out.println("============ DANH SACH THEO DOANH THU TANG DAN ============");
        ds.sort(new Comparator<ChuyenXeLienTinh>() {
            @Override
            public int compare(ChuyenXeLienTinh o1, ChuyenXeLienTinh o2) {
                return Double.compare(o1.getDoanhThu(), o2.getDoanhThu());
            }
        });
        cx.xuatTieuDe();
        for (ChuyenXeLienTinh x : ds) {
            x.xuat();
        }

        System.out.println("========= CHUYEN XE CO DOANH THU CAO NHAT==========");
        double max = ds.get(0).getDoanhThu();
        for (ChuyenXeLienTinh x : ds) {
            if (x.getDoanhThu() > max)
                max = x.getDoanhThu();
        }

        cx.xuatTieuDe();
        for (ChuyenXeLienTinh x : ds) {
            if (x.getDoanhThu() == max) {
                x.xuat();
                break;
            }
        }
    }
}
