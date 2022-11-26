import java.io.*;
import java.util.*;

class Solution {
    public void diagonalDifference(int[][] mat, int n) {

        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    d1 = d1 + mat[i][j];
                if ((i + j) == (n - 1))
                    d2 = d2 + mat[i][j];
            }
        }
        System.out.print(Math.abs(d1 - d2));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.diagonalDifference(mat, n);
        System.out.println('\n');
    }
}
