import java.util.Scanner;

public class Main{
	static int m;
	static int n;
	static int [][]visit;
	static int [][]cab;
	static int []xdir = {-1, 1, 0, 0};
	static int []ydir = {0, 0, -1, 1};
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		int []answer = new int[t];
		for (int q = 0 ; q < t ; q++)
		{
			m = sn.nextInt();
			n = sn.nextInt();
			int k = sn.nextInt();

			visit = new int[51][51];
			cab = new int[51][51];
			for (int i = 0 ; i < k ;i++){
				int a = sn.nextInt();
				int a2 = sn.nextInt();
				cab[a2][a] = 1;
			}
			int cnt = 0;
			for (int x = 0 ; x < n ; x++){
				for (int y = 0 ; y < m ;y++){
					if (visit[x][y] == 0 && cab[x][y] == 1)
					{
						dfs(x, y);
						cnt++;
					}
				}
			}
			answer[q] = cnt; 
		}
		for (int i : answer) {
			System.out.println(i);
		}
	}
	private static void dfs(int x, int y) {
		visit[x][y] = 1;
		for (int i = 0 ; i < 4 ;i++){
			int x1 = x + xdir[i];
			int y1 = y + ydir[i];
			if (0 <= x1 && 0 <= y1 && x1 < n && y1 < m){
				if (cab[x1][y1] == 1 && visit[x1][y1] == 0)
					dfs(x1, y1);
			}
		}
	}
}