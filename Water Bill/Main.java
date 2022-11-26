import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 1;
        if (n <= 100) {
            total = n * 15;
        } else if (n > 100 && n <= 200) {
            total = 100 * 15;
            int r = n - 100;
            total = total + (r * 14);
        } else {
            total = 100 * 15;
            total = total + (100 * 14);
            int r = n - 200;
            total = total + (r * 12);
        }
        System.out.println(total);
    }
}