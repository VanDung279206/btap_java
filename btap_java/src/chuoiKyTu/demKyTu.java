package chuoiKyTu;

import java.util.HashSet;
import java.util.Scanner;

public class demKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("m nhập đi e: ");
        String a = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {
            set.add(a.charAt(i));
        }

        System.out.print("số ký tự khác nhau: " + set.size());
        System.out.println("\ncac ky tu: " + set);
    }
}
