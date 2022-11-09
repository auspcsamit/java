import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;

        int area = (int) (pi * r * r);
        int perimeter = (int) (2 * pi * r);

        System.out.println(area);
        System.out.println(perimeter);
    }
}