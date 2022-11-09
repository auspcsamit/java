import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        int c = 0;

        c = (F - 32) * 5 / 9;

        System.out.println(c);

    }
}