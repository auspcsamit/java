
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isPowerOfThree(n))
            System.out.print("yes");
        else
            System.out.print("no");
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        if (n % 3 == 0)
            return isPowerOfThree(n / 3);
        if (n == 1)
            return true;
        return false;
    }
}