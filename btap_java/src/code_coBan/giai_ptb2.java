package code_coBan;

import java.util.Scanner;

public class giai_ptb2 {
    public static void main(String[] args) {
        //ax^2 + bx + c
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = sc.nextDouble();
        while (a == 0) {
            System.out.println("nếu a = 0 thì phương trình không phải là phươn trình bậc 2, nhập lại: ");
            a = sc.nextDouble();
        }
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        System.out.println("nhập c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            double x = (-b) / (2 * a);
            System.out.println("phương trình có nghiệm phức: \n" +
                    "x1 = " + x + " + " + (Math.sqrt(Math.abs(delta))) / (2 * a) + "i" +
                    "\nx2 = " + x + " - " + (Math.sqrt(Math.abs(delta))) / (2 * a) + "i");
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.println("phương trình có 2 nghiệp kép x1 = x2 = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("phương trình có 2 nghiệm phân biệt\n" +
                    "x1 = " + x1 +
                    "\nx2 = " + x2);
        }
    }
}
