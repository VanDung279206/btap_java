package Collection.QuanLySoNguyen;

import java.util.*;

public class QuanLySoNguyen {
    private Set<Integer> tapHop;

    public QuanLySoNguyen() {
        tapHop = new HashSet<>();
    }

    public void nhap(Scanner sc){
        System.out.print("nhap so luong phan tu: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu "+ (i + 1) +": ");
            int x = Integer.parseInt(sc.nextLine());

            if (tapHop.add(x)){
                System.out.println("them thanh cong");
            }else {
                System.out.println("phan tu da ton tai");
                i--;
            }

        }
    }

    public void xuat(){
        if (tapHop.isEmpty()){
            System.out.println("tap hop rong");
            return;
        }

        System.out.println("tap hop: " + tapHop);
    }

    public void timKiem(int x){
        if (tapHop.contains(x)){
            System.out.println("tim thay "+ x +" trong tap hop");
        }else {
            System.out.println("khong tim thay "+ x +" trong tap hop");
        }
    }

    private boolean laSoNguyenTo(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;

        }
        return  true;
    }

    public void xuatSoNguyenTo(){
        boolean coSoNguyenTo = false;

        System.out.print("cac so nguyen to: ");
        for (int x : tapHop){
            if (laSoNguyenTo(x)){
                System.out.print(x + " ");
                coSoNguyenTo = true;
            }
        }

        if (!coSoNguyenTo){
            System.out.print("khong co");
        }

        System.out.println();
    }

    // sap xep bang collections.sort()
    public void sapXep(){
        List<Integer> danhSach = new ArrayList<>(tapHop);

        Collections.sort(danhSach);

        System.out.println("tap hop sau khi sap xep: " + danhSach);
    }

    public void xoa(int x){
        if (tapHop.remove(x)){
            System.out.println("xoa thanh cong "+ x);
        }else {
            System.out.println("khong tim thay "+ x);
        }
    }
}
