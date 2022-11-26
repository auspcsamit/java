import java.util.*;

class Solution {
    static int facingSun(int size, int arr[]) {

        int count = 1;
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }

        }
        return count;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.facingSun(n, array));
    }
}
