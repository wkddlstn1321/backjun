import java.util.*;
import java.awt.*;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int m = sn.nextInt();
		int []dirx = {1, -1, 0, 0};
		int []diry = {0, 0, 1, -1};
		int [][]visit = new int[n][m];
		int [][]maze = new int[n][m];
		Queue <Point> q = new LinkedList<>();
		for (int i = 0 ; i < n ; i++){
			String s = sn.next();
			for (int j = 0 ; j < m ; j++){
				maze[i][j] = s.charAt(j) - 48;
			}
		}
		q.offer(new Point(0,0));
		visit[0][0] = 1;
		while(!q.isEmpty())
		{
			Point xy = q.poll();
			for (int i = 0 ; i < 4 ; i++){
				int x1 = xy.x+ dirx[i];
				int y1 = xy.y + diry[i];
				if (x1 >= 0 && y1 >= 0 && x1 < n && y1 < m){
					if (maze[x1][y1] == 1 && visit[x1][y1] == 0){
						q.offer(new Point(x1,y1));
						visit[x1][y1] = 1;
						maze[x1][y1] = maze[xy.x][xy.y] + 1;
					}
				}
			}
		}
		System.out.println(maze[n - 1][m - 1]);
	}
}