import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * n;
        }
        System.out.print(res);
    }
}