package BtapLtap_TX1.QuanLyChuyenXe;

import java.util.Scanner;

public class ChuyenXeLienTinh extends ChuyenXe implements DoanhThu {
    private double soKMDiDuoc;
    private double donGia;
    private double doanhThu;

    public ChuyenXeLienTinh() {
    }

    public ChuyenXeLienTinh(String maChuyen, String hoTenTaiXe, int soXe, double soKMDiDuoc, double donGia) {
        super(maChuyen, hoTenTaiXe, soXe);
        this.soKMDiDuoc = soKMDiDuoc;
        this.donGia = donGia;
    }

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);

        System.out.print("nhap so KM di duoc: ");
        soKMDiDuoc = Double.parseDouble(sc.nextLine());

        System.out.print("nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());

        tinhDoanhThu();
    }

    @Override
    public void tinhDoanhThu() {
        doanhThu = (soKMDiDuoc * donGia) - PHI_BAO_HIEM;
        if (soKMDiDuoc > 500) {
            doanhThu += 200000;
        }
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf("%-10f %-15.0f\n",
                soKMDiDuoc, doanhThu);
    }

    public static void xuatTieuDe() {
        System.out.printf("%10s %20s %10s %10s %15s\n",
                "ma chuyen", "ho ten tai xe", "so xe", "so KM di duoc", "doanh thu");
    }

    public double getDoanhThu() {
        return doanhThu;
    }
}
