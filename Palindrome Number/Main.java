import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;
        int reverse = 0;

        while (n != 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }

        if (reverse == originalNum)
            System.out.print("true");
        else
            System.out.print("false");
    }
}