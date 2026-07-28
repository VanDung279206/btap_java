package baitap_6;

public class NhanVien {
    private String maNhanVien;
    private int soSanPham;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, int soSanPham) {
        this.maNhanVien = maNhanVien;
        this.soSanPham = soSanPham;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }
}
