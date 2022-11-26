import java.util.*;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix, int m, int n) {

        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = i;
            int firstElement = matrix[row][col];
            while (row < m && col < n) {

                if (matrix[row][col] != firstElement)
                    return false;
                row++;
                col++;
            }
        }

        for (int i = 0; i < m; i++) {
            int row = i;
            int col = 0;
            int firstElement = matrix[row][col];
            while (row < m && col < n) {

                if (matrix[row][col] != firstElement)
                    return false;
                row++;
                col++;
            }
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        boolean ans = Obj.isToeplitzMatrix(A, m, n);
        System.out.println(ans);
    }
}