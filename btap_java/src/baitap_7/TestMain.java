package baitap_7;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sinh viên 1 nhập bằng hàm tạo đủ tham số

        System.out.println("nhập thông tin sinh viên 1");
        System.out.print("mã sinh viên: ");
        String ma = sc.nextLine();

        System.out.print("họ tên sinh viên: ");
        String ten = sc.nextLine();

        System.out.print("điểm lý thuyết: ");
        double dlt = Double.parseDouble(sc.nextLine());

        System.out.print("điểm thực hành: ");
        double dth = Double.parseDouble(sc.nextLine());

        SinhVien sv1 = new SinhVien(ma, ten, dlt, dth);

        //sinh viên 2 giả trị cố định
        SinhVien sv2 = new SinhVien(2024607310, "Nguyễn Văn Dũng", 10, 01);
    }
}
