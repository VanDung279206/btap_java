package baitap_3;

import java.util.Scanner;

public class PhuongTrinhBac_2 {
    static double a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhap();
        xuat();
    }

    //hàm nhập
    public static void nhap() {
        System.out.print("nhập a: ");
        a = sc.nextDouble();
        if (a == 0) {
            System.out.println("phương trình không phải là phương trình bậc 2");
            return;
        }
        System.out.print("nhập b: ");
        b = sc.nextDouble();
        System.out.print("nhập c: ");
        c = sc.nextDouble();
    }

    //hàm tính delta
    public static double delta() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    // hàm tính x1
    public static double x1() {
        return ((-b) + Math.sqrt(delta())) / (2 * a);
    }

    //hàm tính x2
    public static double x2() {
        return ((-b) - Math.sqrt(delta())) / (2 * a);
    }

    //hàm xuất
    public static void xuat() {
        if(a == 0) return;
        if (delta() < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (delta() == 0) {
            System.out.println("phương trình có nghiệm kép x = " + (-b) / (2 * a));
        } else {
            System.out.println("phương trình có 2 nghiệm phân biệt\nx1 = " + x1() +
                    "\nx2 = " + x2());
        }
    }

}
