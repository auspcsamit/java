import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int originalNum = n;

        for (int i = a; i <= b; i++) {
            long sum = 0;
            int n = i;
            while (n != 0) {
                int rem = n % 10;
                sum = sum + fact(rem);
                n = n / 10;
            }
            if (sum == i)
                System.out.print(i + " ");
            // else
            // System.out.print("0");
        }
    }

    static long fact(int n) {

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}