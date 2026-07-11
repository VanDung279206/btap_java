package code_coBan;

import java.util.Scanner;

public class ktra_ngto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + "không phải là số nguyên tố");
            return;
        }
        boolean check = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
}
