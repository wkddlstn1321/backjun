import java.util.Scanner;

public class Main{
	static int [][]visit;
	static int count = 0;
	static int n;
	static int []dirx = {1, 1, -1, -1};
	static int []diry = {1, -1, 1, -1};
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		visit = new int[n][n];
		dfs(0, 0, 1);
		System.out.println(count);
	}
	private static void dfs(int v, int h, int index) {
		if (index == n){
			count++;
			return ;
		}
		visit[v][h] = 1;
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				if (check(i,j)){
					dfs(i, j, index + 1);
				}
			}
		}
		visit[v][h] = 0;
	}
	private static boolean check(int v, int h) {
		for (int i = 0 ; i < 4 ; i++){
			int x = v;
			int y = h;
			if (visit[x][y] == 1)
				return false;
			for (int j = 0 ; j < n ; j++){
				if (visit[v][j] == 1)
					return false;
				x += dirx[i];
				y += diry[i];
				if (x >= 0 && y >= 0 && x < n && y < n){
					if (visit[x][y] == 1)
						return false;
				}
			}
		}
		return true;
	}
}
//	1 2 3 4 5
//1 1 1 1 1 1
//2 0 1 0 0 0
//3 0 0 1 0 0
//4 0 0 0 1 0
//5 0 0 0 0 1