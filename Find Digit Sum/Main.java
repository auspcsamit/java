import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(digitSum(n));
    }

    static int digitSum(int n) {

        if (n == 0)
            return 0;
        return (n % 10 + digitSum(n / 10));
    }
}