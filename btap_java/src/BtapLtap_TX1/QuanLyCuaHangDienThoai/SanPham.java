package BtapLtap_TX1.QuanLyCuaHangDienThoai;

public abstract class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double giaGoc;

    public SanPham() {
    }

    public abstract double tinhGiaBan();
}
