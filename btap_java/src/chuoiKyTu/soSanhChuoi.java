package chuoiKyTu;

import java.util.Scanner;

public class soSanhChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi thu nhat: ");
        String s1 = sc.nextLine();

        System.out.print("Nhap chuoi thu hai: ");
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Hai chuoi giong nhau.");
        } else {
            System.out.println("Hai chuoi khac nhau.");
        }

    }
}