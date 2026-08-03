package BtapLtap_TX1.QuanLySachThuVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sach s = new Sach();

        s.nhap(sc);
        s.hienThiThongTinSach();
    }
}
