import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char ch = input.charAt(0);
        switch (ch) {
            case 'A':
                System.out.print("I am the first letter");
                break;
            case 'B':
                System.out.print("I am the second letter");
                break;
            case 'C':
                System.out.print("I am the third letter");
                break;
            case 'D':
                System.out.print("I am the fourth letter");
                break;
            case 'E':
                System.out.print("I am the fifth letter");
                break;
            default:
                System.out.print("I don't belong here");
        }
    }
}