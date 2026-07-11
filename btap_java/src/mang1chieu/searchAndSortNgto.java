package mang1chieu;

import java.util.Scanner;

public class searchAndSortNgto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập số phần tử mong muốn
        System.out.println("nhập số phần tử bạn mong muốn trong 1 mảng: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("nhập lại đi, m nhập vớ vẩn gì đấy:))");
            n = sc.nextInt();
        }

        //khởi tạo mảng
        int[] arr = new int[n];

        //nhập sô vào mảng
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + (i + 1) + "] = ");
            arr[i] = sc.nextInt();
        }

        //xuất mảng
        System.out.println("mảng sau khi nhập: ");
        System.out.print("[ ");
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        System.out.print("]\n");

        //đưa số nguyên tố lên đầu
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (soNgto(arr[i])) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }

        //sắp xếp các số nguyên tố
        for (int i = 0; i < k; i++) {
            int min = i;
            for (int j = i + 1; j < k; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        //xuất kết quả
        System.out.println("mảng sa khi xử lý: ");
        System.out.print("[ ");
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        System.out.print("]\n");
    }

    //hàm tìm số nguyên tố
    public static boolean soNgto(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
