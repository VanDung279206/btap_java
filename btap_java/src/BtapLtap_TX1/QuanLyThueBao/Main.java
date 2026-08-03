package BtapLtap_TX1.QuanLyThueBao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ThueBaoTheoDungLuong> ds = new ArrayList<>();

        System.out.println("nhap so luong thue bao: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("----- nhap thong tin thue bao thu " + (i + 1) + " -------");
            ThueBaoTheoDungLuong tb = new ThueBaoTheoDungLuong();
            tb.nhap(sc);
            ds.add(tb);
        }

        System.out.println("\n========= DANH SACH THUE BAO VUA NHAP =============");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n",
                "ma thue bao", "chu thue bao", "dia chi", "dung luong", "tien cuoc");
        for (ThueBaoTheoDungLuong x : ds) {
            x.xuat();
        }

        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                if (ds.get(i).getMaThueBao().compareToIgnoreCase(ds.get(j).getMaThueBao()) > 0) {
                    ThueBaoTheoDungLuong temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }

        System.out.println("\n========== DANH SACH THUE BAO SAU KHI SAP XEP =======");
        for (ThueBaoTheoDungLuong x : ds) {
            x.xuat();
        }

        System.out.println("\nnhap ma thue bao can tim kiem: ");
        String maCanTim = sc.nextLine();

        boolean timThay = false;
        System.out.println("--- KET QUA TIM KIEM -----");
        for (ThueBaoTheoDungLuong x : ds) {
            if (x.getMaThueBao().equals(maCanTim)) {
                x.xuat();
                timThay = true;
                break;
            }
        }
        if (!timThay)
            System.out.println("khong tim thay thue bao nao co ma " + maCanTim);
    }
}
