import java.util.*;

class Solution {
    public void printMultiplication(int[][] matrix1, int[][] matrix2, int n) {

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                a[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    a[i][j] = a[i][j] + matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n = sc.nextInt();
            int[][] matrix1 = new int[n][n];
            int[][] matrix2 = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix1[i][j] = sc.nextInt();

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    matrix2[i][j] = sc.nextInt();

            Solution Obj = new Solution();
            Obj.printMultiplication(matrix1, matrix2, n);
        }
        sc.close();
    }
}