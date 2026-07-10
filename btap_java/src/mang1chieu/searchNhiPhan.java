package mang1chieu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class searchNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100) + 1;
        }

        System.out.println("mảng: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.print("\nnhập vào giá trị cần tìm kiếm: ");
        int n = sc.nextInt();

        System.out.println("sắp xếp mảng: ");
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }

        int kq = binarySearch(arr, n);
        if (kq == -1) {
            System.out.println("\nkhông tìm thấy giá trị mà bạn cần tìm");
        } else {
            System.out.println("\nđã tìm thấy " + n + " tại vị trí " + kq);
        }
    }

    // hàm tìm kiếm nhị phân
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
