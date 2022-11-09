import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int Op1 = x + y + z;
        int Op2 = (x * y) - z;

        System.out.println(Op1);
        System.out.println(Op2);
    }
}