import java.util.Scanner;

public class Main {

    static long numberSum(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(numberSum(n));
    }
}