package BtapLtap_TX1.QuanLyNhanVienSales;

import java.util.Scanner;

public class NhanVienBanHang extends NhanVien implements KPI, ChuanHoa {
    private int soSanPhamBanDuoc;

    public NhanVienBanHang() {
    }

    public double luong() {
        if (soSanPhamBanDuoc >= CHI_TIEU) {
            return luongCung + (soSanPhamBanDuoc * 50000) + THUONG;
        }
        return luongCung + (soSanPhamBanDuoc * 50000);
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        if (this.maNV.trim().isEmpty())
            return;

        System.out.print("nhap so san pham ban duoc: ");
        soSanPhamBanDuoc = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String chuanHoaTen() {
        if (tenNV == null || tenNV.isEmpty())
            return tenNV;

        String[] words = tenNV.trim().split("\\s+");
        StringBuilder tenDaChuanHoa = new StringBuilder();

        for (String x : words) {
            String firstLetter = x.substring(0, 1).toUpperCase();
            String remainingLetter = x.substring(1).toLowerCase();
            tenDaChuanHoa.append(firstLetter).append(remainingLetter).append(" ");
        }

        this.tenNV = tenDaChuanHoa.toString().trim();
        return this.tenNV;
    }

    @Override
    public void xuat() {
        chuanHoaTen();
        super.xuat();

        System.out.printf("%-10d %-15.0f\n",
                soSanPhamBanDuoc, luong());
    }

    public static void xuatTieuDe() {
        System.out.printf("%-10s %-20s %-10s %-15s\n",
                "Ma NV", "Ten NV", "So SP", "Luong");
    }

    public int getSoSanPhamBanDuoc() {
        return soSanPhamBanDuoc;
    }
}
