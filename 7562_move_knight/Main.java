import java.util.*;
import java.awt.*;
public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int k = sn.nextInt();
		Queue<Point> q;
		int [][]visit;
		int []dirx =  {2, 2, -2, -2, 1, 1, -1 , -1};
		int []diry = {-1, 1, -1, 1 ,2 ,-2 ,2, -2};
		for (int z = 0 ; z < k ; z++){
			q = new LinkedList<>();
			int size = sn.nextInt();
			visit = new int[size][size];
			int dx = sn.nextInt();
			int dy = sn.nextInt();
			int x = sn.nextInt();
			int y = sn.nextInt();
			q.offer(new Point(dx, dy));
			visit[dx][dy] = 1;
			while(!q.isEmpty())
			{
				Point xy = q.poll();
				for (int i = 0 ; i < 8 ; i++){
					int x1 = xy.x + dirx[i];
					int y1 = xy.y + diry[i];
					if (x1 >= 0 && y1 >= 0 && x1 < size && y1 < size){
						if (visit[x1][y1] == 0)
						{
							q.offer(new Point(x1, y1));
							visit[x1][y1] = visit[xy.x][xy.y] + 1;
							// if (x1 == x && y1 == y)
							// 	break ;
						}
					}
				}
			}
			System.out.println(visit[x][y] - 1);
		}
	}
}