import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        do {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // if(a<b && a<c)
            // System.out.println(a);
            // else if(b<a && b<c)
            // System.out.println(b);
            // else
            // System.out.println(c);

            int min = Math.min(Math.min(a, b), c);
            System.out.println(min);
            t--;

        } while (t != 0);
    }
}