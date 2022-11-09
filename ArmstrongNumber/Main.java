import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 1, num2 = n;

        for (int i = num1; i < num2; i++) {
            int check, rem, sum = 0;
            check = i;
            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println(i + " ");
            }
        }
    }
}