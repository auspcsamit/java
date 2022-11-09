import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        if (v1 >= v2) {
            System.out.println(false);
        } else {
            int t = (h1 - h2) / (v2 - v1);
            if ((h1 - h2) % (v2 - v1) == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }
}