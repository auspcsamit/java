import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        countPal(a, b);
    }

    static void countPal(int a, int b) {

        for (int i = a; i <= b; i++) {
            int o = i;
            int reverse = 0;
            while (o != 0) {

                int rem = o % 10;
                reverse = reverse * 10 + rem;
                o = o / 10;
            }
            if (reverse == i)
                System.out.print(reverse + " ");
        }
    }
}