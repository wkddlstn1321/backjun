import java.util.*;
import java.awt.*;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int m = sn.nextInt();
		Queue<Point> q = new LinkedList<>();
		int []key = new int[6];
		int [][]visit = new int[n][m];
		int []dirx = {1, -1, 0, 0};
		int []diry = {0, 0, 1, -1};
		String []s = new String[n];
		for (int i = 0 ; i < n ; i++){
			s[i] = sn.next();
			for (int j = 0 ; j < m ; j++){
				if (s[i].charAt(j) == '0')
					q.offer(new Point(i, j));
			}
		}
		while (!q.isEmpty()){
			Point xy = q.poll();
			for (int i = 0 ; i < 4 ; i++){
				int x = xy.x + dirx[i];
				int y = xy.y + diry[i];
				if (x >= 0 && y >= 0 && x < n && y < m){
					if (s[x].charAt(y) != '#'){
						if (s[x].charAt(y) == 'A'){
							if (key[0] == 1)
							{
								q.offer(new Point(x, y));
								if (visit[x][y] < visit[xy.x][xy.y] + 1)
									visit[x][y] = visit[xy.x][xy.y] + 1;
							}
						}
						else if (s[x].charAt(y) == 'B'){
							if (key[1] == 1)
							{
								q.offer(new Point(x, y));
								if (visit[x][y] < visit[xy.x][xy.y] + 1)
									visit[x][y] = visit[xy.x][xy.y] + 1;
							}
						}
						else if (s[x].charAt(y) == 'C'){
							if (key[2] == 1)
							{
								q.offer(new Point(x, y));
								if (visit[x][y] < visit[xy.x][xy.y] + 1)
									visit[x][y] = visit[xy.x][xy.y] + 1;
							}
						}
						else if (s[x].charAt(y) == 'D'){
							if (key[3] == 1)
							{
								q.offer(new Point(x, y));
								if (visit[x][y] < visit[xy.x][xy.y] + 1)
									visit[x][y] = visit[xy.x][xy.y] + 1;
							}
						}
						else if (s[x].charAt(y) == 'E'){
							if (key[4] == 1)
							{
								q.offer(new Point(x, y));
								if (visit[x][y] < visit[xy.x][xy.y] + 1)
									visit[x][y] = visit[xy.x][xy.y] + 1;
							}
						}
						else if (s[x].charAt(y) == 'F'){
							if (key[5] == 1)
							{
								q.offer(new Point(x, y));
								if (visit[x][y] < visit[xy.x][xy.y] + 1)
									visit[x][y] = visit[xy.x][xy.y] + 1;
							}
						}
						else{
							if (s[x].charAt(y) == 'a')
								key[0] = 1;
							else if (s[x].charAt(y) == 'b')
								key[1] = 1;
							else if (s[x].charAt(y) == 'c')
								key[2] = 1;
							else if (s[x].charAt(y) == 'd')
								key[3] = 1;
							else if (s[x].charAt(y) == 'e')
								key[4] = 1;
							else if (s[x].charAt(y) == 'f')
								key[5] = 1;
							q.offer(new Point(x, y));
							if (visit[x][y] < visit[xy.x][xy.y] + 1)
									visit[x][y] = visit[xy.x][xy.y] + 1;
							if (s[x].charAt(y) == '1')
							{
								System.out.println(visit[x][y]);
								System.exit(0);
							}
						}
					}
				}
			}
		}
		System.out.println(-1);
	}
}