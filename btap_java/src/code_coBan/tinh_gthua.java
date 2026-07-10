import java.util.Scanner;

public class tinh_gthua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số nguyên n: ");
        int n = sc.nextInt();
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println(n + "! = " + gt);
    }
}
