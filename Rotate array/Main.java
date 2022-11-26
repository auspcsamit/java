import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        leftRotateByN(arr, k);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    static void leftRotateByN(int[] arr, int k) {

        for (int i = 0; i < k; i++) {
            leftRotateByOne(arr);
        }
    }

    static void leftRotateByOne(int[] arr) {

        int i;
        int firstElement = arr[0];
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = firstElement;
    }
}