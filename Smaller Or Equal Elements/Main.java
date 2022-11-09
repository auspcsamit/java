import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] <= b)
                count++;
        }

        System.out.print(count);

    }
}