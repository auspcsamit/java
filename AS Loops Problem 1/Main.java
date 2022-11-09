import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch;
        int max = 0;
        int min = 100001;
        do {
            int n = sc.nextInt();
            if (n > max)
                max = n;
            if (n < min)
                min = n;

            String str = sc.next();
            ch = str.charAt(0);
            if (ch == 'n' || ch == 'N')
                break;

        } while (ch == 'y' || ch == 'Y');

        System.out.println("Largest number: " + max);
        System.out.print("Smallest number: " + min);
    }
}