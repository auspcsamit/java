import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }
        if (num == sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}