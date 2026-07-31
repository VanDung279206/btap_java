package baitap_7;

import java.util.Arrays;
import java.util.Comparator;
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
        SinhVien sv2 = new SinhVien("2024607310", "Nguyễn Văn Dũng", 10, 10);

        //sinh viên 3 tạo mặc định rồi set
        SinhVien sv3 = new SinhVien();

        System.out.println("nhập thông tin sinh viên 3");

        System.out.print("mã sinh viên: ");
        sv3.setMaSinhVien(sc.nextLine());

        System.out.print("họ tên: ");
        sv3.setHoTen(sc.nextLine());

        System.out.print("điểm lý thuyết: ");
        sv3.setDiemLyThuyet(Double.parseDouble(sc.nextLine()));

        System.out.print("điểm thực hành: ");
        sv3.setDiemThucHanh(Double.parseDouble(sc.nextLine()));

        SinhVien[] ds = {sv1, sv2, sv3};

        //in danh sách
        System.out.println("\n ========== DANH SÁCH SINH VIÊN ============");

        SinhVien.inTieuDe();
        for (SinhVien x : ds) {
            x.inDuLieu();
        }

        //sắp xếp theo tên
        Arrays.sort(ds, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                String tenA = o1.getHoTen().trim();
                tenA = tenA.substring(tenA.lastIndexOf(" ") + 1);

                String tenB = o2.getHoTen().trim();
                tenB = tenB.substring(tenB.lastIndexOf(" ") + 1);

                int kq = tenA.compareToIgnoreCase(tenB);

                if (kq == 0) {
                    return Double.compare(o1.getDiemLyThuyet(), o2.getDiemLyThuyet());
                }

                return kq;
            }
        });

        System.out.println("\n======== SAU KHI SẮP XẾP ========");

        SinhVien.inTieuDe();

        for (SinhVien x : ds) {
            x.inDuLieu();
        }

        //sinh viên có điểm trung bình lớn nhất
        SinhVien max = ds[0];

        for (SinhVien x : ds) {
            if (x.getDiemTB() > max.getDiemTB()) {
                max = x;
            }
        }

        System.out.println("\n sinh viên có điểm cao nhất: ");
        SinhVien.inTieuDe();
        max.inDuLieu();

        //sinh viên có điểm trung bình nhỏ nhất
        SinhVien min = ds[0];

        for (SinhVien x : ds) {
            if (x.getDiemTB() < min.getDiemTB()) {
                min = x;
            }
        }

        System.out.println("\nsinh viên có điểm trung bình thấp nhất: ");
        SinhVien.inTieuDe();
        min.inDuLieu();
    }
}
