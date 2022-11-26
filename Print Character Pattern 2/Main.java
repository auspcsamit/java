import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c = 0;
        for (int i = 1; i <= n; i++) {

            c = 64 + i;
            for (int j = 1; j <= i; j++) {
                if (c > 90) {
                    c = 65;
                }
                System.out.print((char) c);
                c++;
            }
            System.out.println();
        }
    }
}