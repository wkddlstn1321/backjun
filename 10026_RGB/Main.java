import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static int n;
	static int cnt = 0;
	static char [][]greed;
	static int [][]visit;
	static int []dirx = {1, -1, 0, 0};
	static int []diry = {0, 0, 1, -1};
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		String []s = new String[n];
		for (int i = 0 ; i < n ; i++){
			s[i] = sn.next();
		}
		greed = new char[n][n];
		visit = new int[n][n];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				greed[i][j] = s[i].charAt(j);
			}
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				if (visit[i][j] == 0)
				{
					dfs(greed[i][j], i, j);
					cnt++;
				}
			}
		}
		System.out.print(cnt + " ");
		cnt = 0;
		visit = new int[n][n];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				if (greed[i][j] == 'G')
					greed[i][j] = 'R';
			}
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				if (visit[i][j] == 0)
				{
					dfs(greed[i][j], i, j);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	private static void dfs(char c, int x, int y) {
		visit[x][y] = 1;
		for (int i = 0 ; i < 4 ; i++){
			int nx = x + dirx[i];
			int ny = y + diry[i];
			if (nx >= 0 && ny >= 0 && nx < n && ny < n)
			{
				if (visit[nx][ny] == 0 && greed[nx][ny] == c)
				{
					dfs(c, nx, ny);
				}
			}
		}
	}
}