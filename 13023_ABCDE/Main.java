import java.util.Scanner;

public class Main{
	static int visit[];
	static int link[][];
	static int n;
	static int max;
	static int dp[];

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		int k = sn.nextInt();
		dp = new int[n];
		visit = new int [n];
		link = new int [n][n];
		int a = 0;
		int b = 0;
		for (int i = 0 ; i < k ; i++){
			a = sn.nextInt();
			b = sn.nextInt();
			link[a][b] = 1;
			link[b][a] = 1;
		}
		for (int i = 0 ; i < k ; i++)
		{
			max = 0;
			dfs(i, 0);
			dp[i] = max;
		}
		System.out.println(0);
	}
	private static void dfs(int v, int cnt) {
		if (max < cnt)
			max = cnt;
		if (dp[v] != 0)
		{
			if (cnt + dp[v] == 4)
			{
				System.out.println(1);
				System.exit(0);
			}
			if (max < cnt + dp[v])
				max = cnt + dp[v];
			return ;
		}
		if (cnt == 4)
		{
			System.out.println(1);
			System.exit(0);
		}
		for (int i = 0 ; i < n ; i++){
			if (link[v][i] == 1 && visit[i] == 0)
			{
				visit[v] = 1;
				dfs(i, cnt + 1);
				visit[v] = 0;
			}
		}
	}
}