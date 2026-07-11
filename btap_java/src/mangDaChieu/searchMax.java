package mangDaChieu;

import java.util.Scanner;

public class searchMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nhập số dòng, số cột
        System.out.print("nhập số dòng: ");
        int row = sc.nextInt();
        System.out.print("nhập số cột: ");
        int col = sc.nextInt();

        //khởi tạo mảng 2 chiều
        int[][] arr = new int[row][col];

        //nhập mảng
        System.out.println("\nnhập các phần tử: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("a[" + (i + 1) + "][" + (j + 1) + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }

        //xuất mảng
        System.out.println("\nmảng: ");
        for (int[] y : arr) {
            for (int x : y) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

        //tìm số nguyên tố lớn nhất
        boolean found = false;
        int max = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (soNgto(arr[i][j])) {
                    if (!found || arr[i][j] > max) {
                        max = arr[i][j];
                        found = true;
                    }
                }
            }
        }

        if (found) {
            System.out.println("\nsố nguyên tố lớn nhất là: " + max);
        } else {
            System.out.println("\nmảng không có số nguyên tố");
        }
    }

    //hàm ktra số ngto
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
