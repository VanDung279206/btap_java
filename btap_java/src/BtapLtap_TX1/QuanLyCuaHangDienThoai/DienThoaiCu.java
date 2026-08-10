package BtapLtap_TX1.QuanLyCuaHangDienThoai;

public class DienThoaiCu extends SanPham{
    private double tyLeKhauHao;

    public DienThoaiCu() {
    }

    @Override
    public double tinhGiaBan() {
        return giaGoc - (giaGoc * tyLeKhauHao);
    }
}
