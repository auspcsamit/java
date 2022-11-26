import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int a : arr) {
            sum = sum + a;
        }
        int average = sum / n;

        int max = arr[0];
        for (int b : arr) {
            if (b > max)
                max = b;
        }
        System.out.print(sum + " " + average + " " + max);
    }
}