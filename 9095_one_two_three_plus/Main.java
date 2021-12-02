import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int []dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4 ; i <= 10 ; i++){
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}
		int t = sn.nextInt();
		for (int z = 0 ; z < t ; z++)
		{
			int n = sn.nextInt();
			System.out.println(dp[n]);
		}
	}
}