import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double pi = 3.14;

        double area = pi * r * r;
        double perimeter = 2 * pi * r;

        System.out.println(area);
        System.out.println(perimeter);
    }
}