import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem == d)
                count++;
        }
        System.out.print(count);
    }
}