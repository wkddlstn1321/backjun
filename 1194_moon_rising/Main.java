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
	}
}