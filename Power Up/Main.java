import java.util.*;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int ans = (int) Math.pow(n, p);
        System.out.print(ans);
    }
}