import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(equalIndex(arr, n));
    }

    static int equalIndex(int[] arr, int n) {

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                index = i;
                break;
            }
        }
        if (index != -1)
            return index;
        return -1;
    }
}