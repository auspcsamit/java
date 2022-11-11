import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

              for (int i = 1; i<n; i++){
                      int num = i;
                      int sum = 0;
                      while(num != 0) {
                            int rem = num % 10;
                            sum = sum + (rem * rem * rem);
                            num = num / 10;
                         }
                         if(sum == i){
                            System.out.println(i);
                         }
                    }
    }
}