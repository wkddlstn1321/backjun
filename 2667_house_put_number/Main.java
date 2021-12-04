import java.util.*;
import java.awt.*;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		Queue<Point> q = new LinkedList<>();		//(2, 4)(1, 3)
		int [][]visit = new int[n][n];
		int []dirx = {1, -1, 0, 0};
		int []diry = {0, 0, 1, -1};
		int []house = new int[n * n];
		for (int i = 0 ; i < n ; i++){
			String s = sn.next();
			for (int j = 0 ; j < n ; j++){
				if (s.charAt(j) == '1')
					visit[i][j] = 1;
			}
		}
		int index = 0;
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				int sum = 0;
				if (visit[i][j] == 1)
				{
					q.offer(new Point(i, j));
					while (!q.isEmpty())
					{
						Point xy = q.poll();
						visit[i][j] = 2;
						sum++;
						for (int d = 0 ; d < 4 ; d++){
							int x = xy.x + dirx[d];
							int y = xy.y + diry[d];
							if (x >= 0 && y >= 0 && x < n && y < n && visit[x][y] == 1)
							{
								visit[x][y] = 2;
								q.offer(new Point(x, y));
							}
						}
					}
					house[index] = sum;
					index++;
				}
			}
		}
		int cnt = 0;
		for (int i : house) {
			if (i > 0)
				cnt++;
		}
		System.out.println(cnt);
		Arrays.sort(house);
		for (int i : house) {
			if (i != 0)
				System.out.println(i);
		}
	}
}