import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
            System.out.println("31");
        } else if (n == 2) {
            System.out.println("28");
        } else {
            System.out.println("30");
        }
    }
}