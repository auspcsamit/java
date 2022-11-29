import java.util.*;

class Solution {

    public static void sortCol(int[][] mat, int N, int M) {

        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {

                for (int k = i + 1; k < N; k++) {

                    if (mat[i][j] > mat[k][j]) {
                        int temp = mat[i][j];
                        mat[i][j] = mat[k][j];
                        mat[k][j] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution.sortCol(mat, n, m);

    }
}