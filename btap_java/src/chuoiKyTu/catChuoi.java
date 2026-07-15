package chuoiKyTu;

import java.util.Scanner;

public class catChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine().trim();

        System.out.print("Nhap so luong tu can cat: ");
        int n = sc.nextInt();

        String[] words = str.split("\\s+");

        if (n > words.length) {
            n = words.length;
        }

        System.out.print("Ket qua: ");
        for (int i = 0; i < n; i++) {
            System.out.print(words[i] + " ");
        }

    }
}