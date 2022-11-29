import java.util.*;

public class Main {
    public static void main(    String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}


		int onTime = 0;
		for(int i=0; i<n; i++){
			if(arr[i]<=0)
				onTime++;
		}
		if(onTime >= k)
			System.out.print("NO");
		else
			System.out.print("YES");
    }
}