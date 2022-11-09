import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (A[i] != B[i])
                flag = false;
        }
        if (!flag)
            System.out.print("false");
        else
            System.out.print("true");
    }
}