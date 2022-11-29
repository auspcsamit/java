import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = a % b;

        switch (res) {
            case 0:
                System.out.print("Remainder is too small");
                break;
            case 1:
                System.out.print("Remainder is small");
                break;
            case 2:
                System.out.print("Remainder is large");
                break;
            default:
                System.out.print("Remainder is too large");
        }
    }
}