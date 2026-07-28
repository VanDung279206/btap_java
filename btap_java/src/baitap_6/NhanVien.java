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
        setSoSanPham(soSanPham);
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
            return (double) (500 * 20000 + (soSanPham - 500) * 30000);
        } else return (soSanPham * 20000);
    }

    public static void tieuDe() {
        System.out.printf("%-10s %-15s %-15s %-10s\n",
                "Ma NV", "So SP", "Luong", "Tong ket");
    }

    public void inDL() {
        System.out.printf("%-10s %-15d %-15.0f %-10s\n",
                maNhanVien, soSanPham, getLuong(), getTongKet());
    }

    @Override
    public String toString() {
        return String.format("%-10s %-15d %-15.0f %-10s",
                maNhanVien, soSanPham, getLuong(), getTongKet());
    }
}
