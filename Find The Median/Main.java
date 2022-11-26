import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (n % 2 == 0) {
            int sum = 0;
            for (int i = n / 2; i <= n / 2 + 1; i++) {
                sum = sum + arr[i];
            }
            System.out.print(sum / 2);
        } else {
            int index = n / 2;
            System.out.print(arr[index]);
        }
    }
}