import java.io.*;
import java.util.*;

class Solution {
    public void rotateBy90(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int[][] transpose = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = mat[j][i];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j >= 0; j--) {
                // for(int i=0; i<m; i++){
                // for(int j=0; j<n; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.rotateBy90(mat);
        System.out.println('\n');
    }
}