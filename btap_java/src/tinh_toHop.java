import java.util.Scanner;

public class tinh_toHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào m: ");
        int m = sc.nextInt();
        System.out.println("nhập vào n: ");
        int n = sc.nextInt();
        double toHop = gt(n)/(gt(m) - gt(n - m));
        System.out.println("");
    }
    public static int gt(int n){
        if (n == 0 || n ==1) return 1;
        return n*gt(n-1);
    }
}