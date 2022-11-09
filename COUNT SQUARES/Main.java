import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (long i = 1; i < n; i++) {

            if ((i * i) < n)
                count++;
        }
        System.out.print(count);
    }
}