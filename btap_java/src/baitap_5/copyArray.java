package baitap_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class copyArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhap so chieu n: ");
        int n = sc.nextInt();

        int[] dimensions = new int[n];
        Arrays.fill(dimensions, 2);

        // Tạo mảng gốc
        Object array1 = Array.newInstance(int.class, dimensions);

        // Nhập dữ liệu
        System.out.println("Nhap mang:");
        inputArray(array1);

        // Tạo mảng sao chép
        Object array2 = Array.newInstance(int.class, dimensions);

        // Sao chép
        copyArray(array1, array2);

        // In kết quả
        System.out.println("Mang goc:");
        printArray(array1);

        System.out.println("Mang sau khi sao chep:");
        printArray(array2);

    }

    // Nhập dữ liệu
    static void inputArray(Object arr) {
        if (arr.getClass().getComponentType().isArray()) {
            int len = Array.getLength(arr);
            for (int i = 0; i < len; i++) {
                inputArray(Array.get(arr, i));
            }
        } else {
            int len = Array.getLength(arr);
            for (int i = 0; i < len; i++) {
                System.out.print("Nhap phan tu: ");
                Array.setInt(arr, i, sc.nextInt());
            }
        }
    }

    // In mảng
    static void printArray(Object arr) {
        if (arr.getClass().getComponentType().isArray()) {
            int len = Array.getLength(arr);
            for (int i = 0; i < len; i++) {
                printArray(Array.get(arr, i));
            }
        } else {
            int len = Array.getLength(arr);
            for (int i = 0; i < len; i++) {
                System.out.print(Array.getInt(arr, i) + " ");
            }
            System.out.println();
        }
    }

    // Sao chép mảng
    static void copyArray(Object src, Object dest) {
        if (src.getClass().getComponentType().isArray()) {
            int len = Array.getLength(src);
            for (int i = 0; i < len; i++) {
                copyArray(Array.get(src, i), Array.get(dest, i));
            }
        } else {
            int len = Array.getLength(src);
            for (int i = 0; i < len; i++) {
                Array.setInt(dest, i, Array.getInt(src, i));
            }
        }
    }

}
