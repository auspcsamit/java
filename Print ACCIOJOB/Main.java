import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "ACCIOJOB";

        display(s, n);
    }

    static void display(String s, int n) {

        if (n == 0)
            return;
        System.out.println(s);

        display(s, n - 1);
    }
}