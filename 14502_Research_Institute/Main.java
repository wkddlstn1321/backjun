import java.util.*;
import java.awt.*;

public class Main{
	static int [][]res;
	static int [][]clo;
	static int n;
	static int m;
	static int max = 0;
	static Queue<Point> q;
	static int[] dirx = {1, -1, 0, 0};
	static int[] diry = {0, 0, 1, -1};
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		m = sn.nextInt();
		res = new int[n][m];
		for(int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				res[i][j] = sn.nextInt();
			}
		}
		dfs(res, 0);
		System.out.println(max);
	}
	private static void dfs(int [][]res, int wall) {
		if (wall == 3)
		{
			clo = new int[n][m];
			aryclone();
			check(clo);
			return ;
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				if (res[i][j] == 0)
				{
					res[i][j] = 1;
					dfs(res, wall + 1);
					res[i][j] = 0;
				}
			}
		}
	}
	private static void aryclone() {
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				clo[i][j] = res[i][j];
			}
		}
	}
	private static void check(int [][]visit) {
		q = new LinkedList<>();
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				if (visit[i][j] == 2)
					q.offer(new Point(i, j));
			}
		}
		while(!q.isEmpty())
		{
			Point xy = q.poll();
			for (int i = 0 ; i < 4 ; i++){
				int x = xy.x + dirx[i];
				int y = xy.y + diry[i];
				if (x >= 0 && y >= 0 && x < n && y < m && visit[x][y] == 0)
				{
					visit[x][y] = 2;
					q.offer(new Point(x,y));
				}
			}
		}
		int cnt = 0;
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				if (visit[i][j] == 0)
					cnt++;
			}
		}
		if (max < cnt)
			max = cnt;
	}
}

// System.out.println();
// for (int i = 0 ; i < n ; i++){
// 	for (int j = 0 ; j < m ; j++){
// 		System.out.print(res[i][j] + " ");
// 	}
// 	System.out.println();
// }
// System.out.println();