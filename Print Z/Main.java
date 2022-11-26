import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();// n=7
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1 || i == n || j == n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}