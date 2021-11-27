import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		for (int z = 0 ; z < t ; z++){
			int n = sn.nextInt();
			int []dp = new int[n + 1];
			dp[4] = 3;
			for (int i = 5 ; i <= n ; i++){
				dp[i] = dp[i - 1] +
			}
		}
	}
}