import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        do {

            int n = sc.nextInt();
            for (int i = n; i >= 0; i--) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
            System.out.println();

            t--;
        } while (t != 0);
    }
}