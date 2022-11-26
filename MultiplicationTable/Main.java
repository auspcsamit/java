import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a positive integer :");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n * i);
        }
    }
}