import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumNonPrime(arr));
    }

    static int sumNonPrime(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (!isPrime(arr[i]))
                sum = sum + arr[i];
        }
        return sum;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}