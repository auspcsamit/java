import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int found = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if ((nums[i] + nums[j]) == target) {
                    System.out.print(i + " " + j);
                    found = 1;
                }
                if (found == 1)
                    break;
            }
            if (found == 1)
                break;
        }

    }
}