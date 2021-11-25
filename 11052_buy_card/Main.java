import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int []dp = new int[n + 1];
		int []price = new int[n + 1];
		for (int i = 1 ; i <= n ; i++){
			price[i] = sn.nextInt();
		}
		for (int i = 1 ; i <= n ; i++){
			dp[i] = price[i];
			for (int j = 1 ; i - j > 0 ; j++){
				dp[i] = Math.max(price[i], dp[j] + dp[i - j]);
				if (price[i] < dp[j] + dp[i - j])
					price[i] = dp[j] + dp[i - j];
			}
		}
		System.out.println(dp[n]);
	}
}
// 2   p2 1,1 
// 3   p3  2 1
// 4   p4 /d3 d1/ d2 d2/
