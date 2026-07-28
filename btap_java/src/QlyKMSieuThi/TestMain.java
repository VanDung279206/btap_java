package QlyKMSieuThi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*DonHangKhuyenMai dh = new DonHangKhuyenMai();

        dh.nhap();
        dh.tinhTongTien();
        dh.xuat();
        dh.xuatHoaDon();*/

        ArrayList<DonHangKhuyenMai> ds = new ArrayList<>();

        DonHangKhuyenMai dh1 = new DonHangKhuyenMai("SP01", "Sua", 100000, 15);
        dh1.tinhTongTien();

        DonHangKhuyenMai dh2 = new DonHangKhuyenMai("SP02", "Banh", 50000, 8);
        dh2.tinhTongTien();

        DonHangKhuyenMai dh3 = new DonHangKhuyenMai("SP03", "Nuoc", 30000, 25);
        dh3.tinhTongTien();

        ds.add(dh1);
        ds.add(dh2);
        ds.add(dh3);

        /*Collections.sort(ds, new Comparator<DonHangKhuyenMai>() {
            @Override
            public int compare(DonHangKhuyenMai o1, DonHangKhuyenMai o2) {
                return Double.compare(o2.getTongTien(), o1.getTongTien());
            }
        });

        System.out.printf("%15s", "DANH SÁCH SAU KHI SẮP XẾP\n");
        dh1.tieuDe();
        for (DonHangKhuyenMai dh : ds) {
            dh.xuatHoaDon();
        }*/

        System.out.println("nhập mã sản phẩm cần tìm: ");
        String maCanTim = sc.nextLine();

        boolean timThay = false;

        for (DonHangKhuyenMai dh : ds) {
            if (dh.getMaSanPham().equalsIgnoreCase(maCanTim)) {
                dh.tieuDe();
                dh.xuatHoaDon();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("không tìm thấy đơn hàng");
        }

    }
}
