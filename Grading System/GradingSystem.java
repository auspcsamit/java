import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 90)
            System.out.print("Excellent");
        else if (n > 80 && n <= 90)
            System.out.print("Good");
        else if (n > 70 && n <= 80)
            System.out.print("Fair");
        else if (n > 60 && n <= 70)
            System.out.print("Meets Expectations");
        else
            System.out.print("Below Expectations");
    }
}