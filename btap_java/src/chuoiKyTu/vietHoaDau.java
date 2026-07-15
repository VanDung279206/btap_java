package chuoiKyTu;

import java.util.Scanner;

public class vietHoaDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine().toLowerCase();

        StringBuilder result = new StringBuilder();

        boolean vietHoa = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') {
                vietHoa = true;
                result.append(c);
            } else {
                if (vietHoa) {
                    result.append(Character.toUpperCase(c));
                    vietHoa = false;
                } else {
                    result.append(c);
                }
            }
        }

        System.out.println("Ket qua: " + result);

    }
}