import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        do {

            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            int[] C = sumPro(A, n);
            System.out.println(C[0] + " " + C[1]);
            t--;

        } while (t != 0);
    }

    static int[] sumPro(int[] A, int n) {

        Arrays.sort(A);
        int sum = 0;
        int product = 1;
        sum = A[0] + A[n - 1];
        product = A[0] * A[n - 1];

        int[] B = new int[2];
        B[0] = sum;
        B[1] = product;

        return B;
    }
}