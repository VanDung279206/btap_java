package baitap_8;

public class TestMain {
    public static void main(String[] args) {
        HinhPhang[] ds = new HinhPhang[3];

        ds[0] = new HinhVuong();
        ds[1] = new HinhChuNhat();
        ds[2] = new HinhTron();

        System.out.println("======== NHẬP THÔNG TIN CÁC HÌNH ========");

        for (HinhPhang x : ds) {
            x.nhap();
            System.out.println();
        }

        System.out.println("\n======== THÔNG TIN CÁC HÌNH ========");

        for (HinhPhang x : ds) {
            x.xuat();
        }
    }
}
