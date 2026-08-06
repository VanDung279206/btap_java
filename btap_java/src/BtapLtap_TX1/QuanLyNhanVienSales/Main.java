package BtapLtap_TX1.QuanLyNhanVienSales;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<NhanVienBanHang> ds = new ArrayList<>();

        System.out.println("--- NHAP SANH SACH NHAN VIEN ---");
        while (true) {
            NhanVienBanHang nv = new NhanVienBanHang();
            nv.nhap(sc);

            if (nv.maNV.trim().isEmpty()) {
                System.out.println("da ket thuc viec nhap lieu");
                break;
            }

            ds.add(nv);
        }

        System.out.println("=========== DANH SACH NHAN VIEN ===============");
        NhanVienBanHang.xuatTieuDe();
        for (NhanVienBanHang x : ds) {
            x.xuat();
        }

        ds.sort(new Comparator<NhanVienBanHang>() {
            @Override
            public int compare(NhanVienBanHang o1, NhanVienBanHang o2) {
                int cmpLuong = Double.compare(o2.luong(), o1.luong());

                if (cmpLuong != 0)
                    return cmpLuong;

                return o1.getTenNV().compareToIgnoreCase(o2.getTenNV());
            }
        });

        System.out.println("\n========= DANH SACH NHAN VIEN SAU KHI SAP XEP ============");
        NhanVienBanHang.xuatTieuDe();
        for (NhanVienBanHang x : ds) {
            x.xuat();
        }

        ArrayList<NhanVienBanHang> dsVinhDanh = new ArrayList<>();

        for (NhanVienBanHang x : ds) {
            if (x.getSoSanPhamBanDuoc() >= KPI.CHI_TIEU)
                dsVinhDanh.add(x);
        }

        System.out.println("\n============ DANH SACH VINH DANH ==================");
        if (dsVinhDanh.isEmpty()) {
            System.out.println("khong co nhan vien nao dat KPI trong thang nay");
        } else {
            NhanVienBanHang.xuatTieuDe();
            for (NhanVienBanHang x : dsVinhDanh) {
                x.xuat();
            }
        }
    }
}
