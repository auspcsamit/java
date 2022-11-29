import java.io.*;
import java.util.*;

class Solution {
    public void printFindParticipants(int[] arr, int n, int k) {

        int count = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] > 0 && arr[i] >= arr[k - 1]) {
                count++;
            }
        }
        System.out.print(count);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Solution Obj = new Solution();
        Obj.printFindParticipants(arr, n, k);
        sc.close();

    }
}