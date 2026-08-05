package BtapLtap_TX1.QuanLyChuyenXe;

import java.util.Scanner;

public abstract class ChuyenXe {
    protected String maChuyen;
    protected String hoTenTaiXe;
    protected int soXe;

    public ChuyenXe() {
    }

    public ChuyenXe(String maChuyen, String hoTenTaiXe, int soXe) {
        this.maChuyen = maChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
    }

    public void nhap(Scanner sc) {
        System.out.print("nhap ma chuen xe: ");
        maChuyen = sc.nextLine();

        System.out.print("nhap ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();

        System.out.print("nhap so xe: ");
        soXe = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        System.out.printf("%-10s %-20s %-11d",
                maChuyen, hoTenTaiXe, soXe);
    }
}
