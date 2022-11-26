import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution ob = new Solution();
        int ans = ob.findSum(A, n, m);
        System.out.println(ans);
        sc.close();
    }
}

class Solution {
    int findSum(int[][] arr, int n, int m) {

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}