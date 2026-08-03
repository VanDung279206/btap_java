package BtapLtap_TX1.QuanLySachThuVien;

import java.util.Scanner;

public class TacGia {
    //thuoc tinh
    private String tenTacGia;
    private int namSinh;

    //constructor

    public TacGia() {
    }

    public TacGia(String tenTacGia, int namSinh) {
        this.tenTacGia = tenTacGia;
        this.namSinh = namSinh;
    }

    public void nhap(Scanner sc){
        System.out.print("nhap ten tac gia: ");
        tenTacGia = sc.nextLine();

        System.out.print("nhap nam sinh tac gia: ");
        namSinh = Integer.parseInt(sc.nextLine());

    }

    public void hienThiThongTinTacGia() {
        System.out.printf("%-20s %-10d\n",
                tenTacGia, namSinh);
    }

    // getter va setter

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
