import java.util.*;

class Accio {
    static int[][] BooleanMatrixProblem(int m, int n, int[][] arr) {

        for (int i = 0; i < m; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 1;
                }
            }
        }

        return arr;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        Accio obj = new Accio();
        int[][] ans = obj.BooleanMatrixProblem(m, n, nums);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}