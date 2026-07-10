import java.util.Scanner;

public class tinh_toHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào m: ");
        int m = sc.nextInt();
        System.out.println("nhập vào n: ");
        int n = sc.nextInt();
        if (m < 0 || n < 0 || m > n) {
            System.out.println("dữ liệu không hợp lệ");
            return;
        }
        double toHop = (double) gt(n) / (gt(m) * gt(n - m));
        System.out.println("C(m, n) = " + toHop);
    }

    public static int gt(int n) {
        if (n == 0 || n == 1) return 1;
        return n * gt(n - 1);
    }
}