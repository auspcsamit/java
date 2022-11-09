import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 28:
                System.out.print("i am young");
                break;
            default:
                System.out.print("i am not young.");
        }
    }
}