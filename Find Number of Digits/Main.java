import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(noOfDigits(n));
    }

    static int noOfDigits(int n) {

        if (n / 10 == 0)
            return 1;
        return 1 + noOfDigits(n / 10);
    }
}