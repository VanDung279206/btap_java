package baitap_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HoaDon {
    private String maHD;
    private String ngay;

    private KhachHang kh;

    private ArrayList<HangHoa> ds = new ArrayList<>();

    public HoaDon() {
        kh = new KhachHang();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap ma hoa don: ");
        maHD = sc.nextLine();

        System.out.println("nhap ngay ban: ");
        ngay = sc.nextLine();

        kh.nhap();

        System.out.println("nhap so mat hang: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("mat hang " + (i + 1));
            HangHoa h = new HangHoa();
            h.nhap();
            ds.add(h);
        }
    }

    public double tongTien() {
        double tong = 0;

        for (HangHoa x : ds) {
            tong += x.getThanhTien();
        }
        return tong;
    }

    public double tongSoLuong() {
        double tong = 0;

        for (HangHoa x : ds) {
            tong += x.getSoLuong();
        }
        return tong;
    }

    public void xapSep() {
        Collections.sort(ds, new Comparator<HangHoa>() {
            @Override
            public int compare(HangHoa o1, HangHoa o2) {
                int kq = o1.getTenHang().compareToIgnoreCase(o2.getTenHang());

                if (kq == 0) {
                    return Double.compare(o1.getThanhTien(), o2.getThanhTien());
                }

                return kq;
            }
        });
    }

    public void xuat() {
        System.out.println("====================================================");

        System.out.println("ma HD: " + maHD + "\t\tNgay ban: " + ngay);

        kh.xuat();

        System.out.printf("\n%-15s %-10s %-10s %-10s\n",
                "Ten hang",
                "Don gia",
                "So luong",
                "Thanh tien");

        for (HangHoa x : ds) {
            x.xuat();
        }

        System.out.println("\n-----------------------------------------------------");
        System.out.printf("%-25s %-10.0f %-10.0f", "tong tien", tongSoLuong(), tongTien());
    }
}
