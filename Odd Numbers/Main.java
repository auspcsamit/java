import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int count = 0;
        do {
            int n = sc.nextInt();

            if (n % 2 != 0)
                flag = false;

            count++;

        } while (flag);
        System.out.print(count);
    }
}