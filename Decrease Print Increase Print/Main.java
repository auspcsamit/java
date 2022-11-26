import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDI(n);
    }

    static void printDI(int n) {

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}