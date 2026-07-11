package mangDaChieu;

import java.util.Scanner;

public class timesMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nhập kích thước ma trận A
        System.out.println("nhập số dòng cửa A: ");
        int rowA = sc.nextInt();
        System.out.println("nhập số cột của A: ");
        int colA = sc.nextInt();

        //nhập kích thước của ma trận B
        System.out.println("nhập số dòng của B: ");
        int rowB = sc.nextInt();
        System.out.println("nhập số cột của B: ");
        int colB = sc.nextInt();

        if (colA != rowB) {
            System.out.println("không thể nhân 2 ma trận");
            return;
        }

        int[][] A = new int[rowA][colA];
        int[][] B = new int[rowB][colB];
        int[][] C = new int[rowA][colB];

        //nhập A
        System.out.println("nhập ma trận A: ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        //nhập B
        System.out.println("nhập ma trận B: ");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        //nhân 2 ma trận
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                C[i][j] = 0;
                for (int k = 0; k < colA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        //xuất kết quả
        System.out.println("ma trận tích");
        for (int[] y : C) {
            for (int x : y) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
