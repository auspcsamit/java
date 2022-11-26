import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.print(gcd(m, n));
    }

    static int gcd(int m, int n) {

        int gcd = 1;

        for (int i = 1; i <= m && i <= n; ++i) {
            if (m % i == 0 && n % i == 0)
                gcd = i;
        }
        return gcd;
    }
}