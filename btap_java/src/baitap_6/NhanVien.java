package baitap_6;

public class NhanVien {
    private String maNhanVien;
    private int soSanPham;

    public NhanVien() {
        maNhanVien = " ";
        soSanPham = 0;
    }

    public NhanVien(String maNhanVien, int soSanPham) {
        this.maNhanVien = maNhanVien;
        setSoSP(soSanPham);
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
        if (soSanPham > 0) this.soSanPham = soSanPham;
        else this.soSanPham = 0;
    }

    public boolean coVuotChuan() {
        return soSanPham > 500;
    }

    public String getTongKet() {
        if (coVuotChuan()) return "Vượt chuẩn";
        else return "không vượt chuẩn";
    }

    public double getLuong() {
        if (coVuotChuan()) {
            return 500 * 20000 + (soSanPham - 500) * 30000;
        } else return (soSanPham * 20000);
    }
}
