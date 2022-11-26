import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print(maxNum(a, b, c));
    }

    static int maxNum(int a, int b, int c) {

        int max = (int) Math.max(Math.max(a, b), c);
        return max;
    }
}