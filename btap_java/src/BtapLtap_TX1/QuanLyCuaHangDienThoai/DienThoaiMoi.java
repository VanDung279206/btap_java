package BtapLtap_TX1.QuanLyCuaHangDienThoai;

public class DienThoaiMoi extends SanPham{
    private double thueVAT = 0.1;

    public DienThoaiMoi() {
    }

    @Override
    public double tinhGiaBan() {
        return giaGoc + (giaGoc * thueVAT);
    }
}
