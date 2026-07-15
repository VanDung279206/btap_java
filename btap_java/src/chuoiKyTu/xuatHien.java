package chuoiKyTu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class xuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Đếm số lần xuất hiện của từng ký tự
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        // Tìm tần suất lớn nhất
        int max = 0;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }

        // In các ký tự có tần suất lớn nhất
        System.out.print("Ky tu co tan suat lon nhat:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
