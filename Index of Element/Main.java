import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                flag = false;
                System.out.print(i + 1 + " ");
            }
        }
        if (flag)
            System.out.print("-1");
    }
}