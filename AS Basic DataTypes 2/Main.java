import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(counting(a, b, c));
    }

    static int counting(int a, int b, int c) {

        int count = 0;
        if (a < 0)
            count++;
        if (b < 0)
            count++;
        if (c < 0)
            count++;
        return count;
    }
}