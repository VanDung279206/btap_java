package baitap_12;


import java.util.ArrayList;

public class QuanLyHang {
    private ArrayList<Hang> ds;

    public QuanLyHang(ArrayList<Hang> ds) {
        this.ds = ds;
    }

    public boolean tonTaiMa(String ma) {
        for (Hang x : ds) {
            if (x.getMaHang().equalsIgnoreCase(ma))
                return true;
        }
        return false;
    }

    public boolean them(Hang x) {
        if (tonTaiMa(x.getMaHang()))
            return false;
        ds.add(x);

        return true;
    }

    public void xuatDanhSach() {
        if (ds.size() == 0) {
            System.out.println("danh sach rong");
            return;
        }

        System.out.println("\n=========== DANH SACH HANG HOA ==============");

        for (Hang x : ds) {
            x.xuat();
        }
    }

    public void xuatHangThucPham() {
        System.out.println("\n================ HANG THUC PHAM =============");

        for (Hang x : ds) {
            if (x instanceof HangThucPham) {
                x.xuat();
            }
        }
    }

    public void xuatHangDienMay() {
        System.out.println("\n============== HANG DIEN MAY ================");

        for (Hang x : ds) {
            if (x instanceof HangDienMay) {
                x.xuat();
            }
        }
    }

    public void xuatHangSanhSu() {
        System.out.println("\n================ HANG SANH SU ===============");

        for (Hang x : ds) {
            if (x instanceof HangSanhSu) {
                x.xuat();
            }
        }
    }
}
