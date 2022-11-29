import java.util.*;

class Solution {
    public static int[] result(int n, int[][] mat) {

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            int rowNSum = 0;
            int colNSum = 0;
            for (int j = 0; j < n; j++) {
                rowNSum += mat[i][j];
            }
            for (int j = 0; j < n; j++) {
                colNSum += mat[j][i];
            }
            int ans = colNSum - rowNSum;
            a[i] = ans;
        }
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }
        int[] res = Solution.result(n, mat);
        for (int i = 0; i < n; i++)
            System.out.println(res[i] + " ");
    }
}