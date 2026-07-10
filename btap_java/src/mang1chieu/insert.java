package mang1chieu;

import java.util.Random;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 5;
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        System.out.print("mảng ban đầu: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("\nnhập giá trị cần chèn: ");
        int k = sc.nextInt();

        //tìm vị trí cần chèn
        int viTri = 0;
        while (viTri < n && arr[viTri] < k) {
            viTri++;
        }

        //dịch phần tử sang phải
        for (int i = n; i > viTri; i--) {
            arr[i] = arr[i - 1];
        }

        //chèn giá trị
        arr[viTri] = k;
        n++;

        System.out.print("mảng sau kh chèn: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
