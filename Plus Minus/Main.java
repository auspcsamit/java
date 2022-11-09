import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double positive = 0;
        double negative = 0;
        double zeros = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a < 0) {
                negative++;
            } else if (a > 0) {
                positive++;
            } else {
                zeros++;
            }
        }

        double total = n;

        System.out.println(positive / total);
        System.out.println(negative / total);
        System.out.println(zeros / total);
    }
}