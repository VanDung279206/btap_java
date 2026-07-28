package QlyKMSieuThi;

import java.util.Scanner;

public class DonHangKhuyenMai extends SanPham implements TinhTien {

    private int soLuongMua;
    private double tongTien;
    private double tiLeKhuyenMai;
    private double tienGiam;

    public DonHangKhuyenMai() {
        super();
    }

    public DonHangKhuyenMai(String maSanPham, String tenSanPham, double donGia, int soLuongMua) {
        super(maSanPham, tenSanPham, donGia);
        this.soLuongMua = soLuongMua;
    }

    @Override
    public void tinhTongTien() {
        tongTien = donGia * soLuongMua;

        tiLeKhuyenMai = 0;
        if (soLuongMua >= NGUONG_SL) {
            tiLeKhuyenMai = (soLuongMua - NGUONG_SL) * 0.01;

            if (tiLeKhuyenMai > MUC_KH_MAX) {
                tiLeKhuyenMai = MUC_KH_MAX;
            }
        }

        tienGiam = tongTien * tiLeKhuyenMai;
        tongTien -= tienGiam;
    }

    @Override
    public void xuatHoaDon() {
       /* super.xuat();

        System.out.println("số lượng mua: " + soLuongMua);
        System.out.println("tỉ lệ khuyến mãi: " + (tiLeKhuyenMai * 100) + "%");
        System.out.println("tiền giảm: " + tienGiam);
        System.out.println("tổng tiền thanh toán: " + tongTien);*/
        System.out.printf("%-20s %-15s %-10.2f %-20d %-10.2f\n", maSanPham, tenSanPham, donGia, soLuongMua, tongTien);
    }

    public void tieuDe(){
        System.out.printf("%-20s %-15s %-10s %-20s %-10s\n", "mã sản phẩm", "tên sản phẩm", "đơn giá", "số lượng mua", "tổng tiền");
    }

    @Override
    public void nhap() {
        super.nhap();

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng mua: ");
        soLuongMua = sc.nextInt();
    }

    public double getTongTien() {
        return tongTien;
    }
}
