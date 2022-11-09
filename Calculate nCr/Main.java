import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(nCr(n, r));
    }

    static long nCr(int n, int r) {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    static long fact(int n) {
        if (n == 0)
            return 1;
        long res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}