package BtapLtap_TX1.QuanLyThueBao;

import java.util.Scanner;

public abstract class ThueBao {
    protected String maThueBao;
    protected String tenChuThueBao;
    protected String diaChi;

    public ThueBao() {
    }

    public ThueBao(String maThueBao, String tenChuThueBao, String diaChi) {
        this.maThueBao = maThueBao;
        this.tenChuThueBao = tenChuThueBao;
        this.diaChi = diaChi;
    }

    public void nhap(Scanner sc) {
        System.out.println("nhap ma thue bao: ");
        maThueBao = sc.nextLine();

        System.out.println("nhap ten cua chu thue bao: ");
        tenChuThueBao = sc.nextLine();

        System.out.println("nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public void xuat() {
        System.out.printf("%-20s %-20s %-20s",
                maThueBao, tenChuThueBao, diaChi);
    }

    public String getMaThueBao() {
        return maThueBao;
    }
}
