import java.util.Scanner;

public class Main{
	static int []visit = new int[101];
	static int [][]rs = new int[100][100];
	static int n;
	static int b;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		int a = sn.nextInt();
		b = sn.nextInt();
		int m = sn.nextInt();
		for (int i = 0 ; i < m ; i++){
			int x = sn.nextInt();
			int y = sn.nextInt();
			rs[x][y] = 1;
			rs[y][x] = 1;
		}
		int cnt = 0;
		dfs(a, cnt);
		System.out.println(-1);
	}
	private static void dfs(int a, int cnt) {
		visit[a] = 1;
		if (a == b){
			System.out.println(cnt);
			System.exit(0);
		}
		for (int i = 0; i <= n; i++){
			if (rs[i][a] == 1 && visit[i] == 0){
				dfs(i, cnt + 1);
			}
		}
	}
}