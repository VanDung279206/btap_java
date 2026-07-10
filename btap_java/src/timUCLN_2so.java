import java.util.Scanner;

public class timUCLN_2so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a: ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        double UCLN = UCLN(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + UCLN);
    }

    public static double UCLN(double a, double b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
}
