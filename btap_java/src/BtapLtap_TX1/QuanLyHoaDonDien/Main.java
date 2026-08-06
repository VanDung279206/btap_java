package BtapLtap_TX1.QuanLyHoaDonDien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HoaDonDien> ds = new ArrayList<>();

        System.out.print("nhap so luong hoa don: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i =0;i<n;i++){
            System.out.println("------- nhap hoa don thu "+ (i+1)+" ------------");
            HoaDonDien x = new HoaDonDien();
            x.nhap(sc);
            ds.add(x);
        }

        System.out.println("\n============= DANH SACH HOA DON =====================");
        HoaDonDien.xuatTieuDe();
        for (HoaDonDien x : ds){
            x.xuat();
        }

        ds.sort(new Comparator<HoaDonDien>() {
            @Override
            public int compare(HoaDonDien o1, HoaDonDien o2) {
                return o1.getTenKH().compareToIgnoreCase(o2.getTenKH());
            }
        });

        System.out.println("\n============== DANH SACH SAU KHI SAP XEP ====================");
        HoaDonDien.xuatTieuDe();
        for (HoaDonDien x : ds){
            x.xuat();
        }

        System.out.println("\n ------------- xoa ma khach hang ------------");
        System.out.print("nhap ma khach hang can tim: ");
        String maXoa = sc.nextLine();

        boolean daXoa = false;

        for (int i = 0; i<ds.size(); i++){
            if (ds.get(i).getMaKH().equals(maXoa)){
                ds.remove(i);
                daXoa = true;
                break;
            }
        }

        if (!daXoa){
            System.out.println("khong tim thay khach hang co ma: " + maXoa);
        }else {
            System.out.println("=========== DANH SACH SAU KH XOA ===========");
            HoaDonDien.xuatTieuDe();
            for (HoaDonDien x : ds){
                x.xuat();
            }
        }
    }
}
