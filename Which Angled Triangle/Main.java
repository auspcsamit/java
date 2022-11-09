import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxSide = a;

        if (b > maxSide) {
            maxSide = b;
        }
        if (c > maxSide) {
            maxSide = c;
        }

        if ((2 * maxSide * maxSide) > (a * a + b * b + c * c)) {
            System.out.println(3);
        } else if ((2 * maxSide * maxSide) == (a * a + b * b + c * c)) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}