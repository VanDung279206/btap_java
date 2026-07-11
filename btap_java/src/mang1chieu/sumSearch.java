package mang1chieu;

import java.util.Scanner;

public class sumSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("nhập giá trị: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    found = true;
                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k]);
                        if (k < j) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
            }
        }
        if (!found) {
            System.out.println("không có mảng con nào");
        }
    }
}
