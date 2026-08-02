package baitap_10;

import java.util.Scanner;

public class NhanVienSX extends NhanVien{
    private int soSanPham;

    @Override
    public void nhap(){
        super.nhap();

        Scanner sc = new Scanner(System.in);

        System.out.println("số sản phẩm: ");
        soSanPham = sc.nextInt();
    }



    @Override
    public double tinhLuong() {
        return soSanPham * 10000;
    }
}
