import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(numDigits(n));
    }

    static int numDigits(int n) {
        int count = 0;

        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            count++;
        }
        return count;
    }
}