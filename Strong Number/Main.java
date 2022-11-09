import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;

        long sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + fact(rem);
            n = n / 10;
        }

        if (sum == originalNum)
            System.out.print("1");
        else
            System.out.print("0");
    }

    static long fact(int n) {

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}