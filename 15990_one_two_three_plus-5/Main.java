import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int []dp = new int[100001];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 3;
		dp[4] = 3;
		dp[5] = 4;
		for (int i = 0 ; i <= 100000 ; i++){
			dp[i] = 
		}
		int t = sn.nextInt();
		for (int i = 0 ; i < t ; i++){
			int n = sn.nextInt();
			System.out.println(dp[n]);
		}
	}
}
// 1  0
// 2  0
// 3  2		1 + 2, 2 + 1
// 4  3		1 + 3, 3 + 1, 1 + 2 + 1
// 5  4		1 + 3 + 1, 2 + 3, 2 + 1 + 2, 3 + 2