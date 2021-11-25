import java.util.*;
import java.awt.*;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Queue<Point> q = new LinkedList<>();
		int []dirx = {1, -1, 0, 0};
		int []diry = {0, 0, 1, -1};
		int m = sn.nextInt();
		int n = sn.nextInt();
		int [][]visit = new int[n][m];
		int [][]box = new int [n][m];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				box[i][j] = sn.nextInt();
				if (box[i][j] == -1)
					visit[i][j] = -1;
				else if (box[i][j] == 1)
				{
					q.offer(new Point(i, j));
					visit[i][j] = 1;
				}
			}
		}
		int max = 0;
		while (!q.isEmpty())
		{
			Point xy = q.poll();
			for (int i = 0 ; i < 4 ;i++){
				int x = xy.x + dirx[i];
				int y = xy.y + diry[i];
				if (0 <= x && 0 <= y && x < n && y < m && visit[x][y] == 0){
					q.offer(new Point(x, y));
					visit[x][y] = visit[xy.x][xy.y] + 1;
					if (max < visit[x][y])
						max = visit[x][y];
				}
			}
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				if (visit[i][j] == 0)
				{
					System.out.println(-1);
					System.exit(0);
				}
			}
		}
		if (max != 0)
			System.out.println(max - 1);
		else
			System.out.println(0);
	}
}