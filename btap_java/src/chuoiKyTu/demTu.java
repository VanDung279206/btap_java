package chuoiKyTu;

import java.util.Scanner;

public class demTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("So tu: 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("So tu: " + words.length);
        }

    }
}
