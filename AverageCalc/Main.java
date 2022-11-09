import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(calculateAvg(arr));

    }

    static int calculateAvg(int[] arr) {

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        int average = (int) sum / arr.length;
        return average;
    }
}