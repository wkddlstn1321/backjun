import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = sn.nextInt();
		int []visit = new int[1000001];
		q.offer(n);
		while (!q.isEmpty())
		{
			int a = q.poll();
			if (a % 3 == 0 && visit[a / 3] == 0){
				visit[a / 3] = visit[a] + 1;
				if (a / 3 == 1)
					break;
				q.offer(a / 3);
			}
			if (a % 2 == 0 && visit[a / 2] == 0){
				visit[a / 2] = visit[a] + 1;
				if (a / 2 == 1)
					break;
				q.offer(a / 2);
			}
			if (a - 1 > 0 && visit[a - 1] == 0){
				visit[a - 1] = visit[a] + 1;
				if (a - 1 == 1)
					break;
				q.offer(a - 1);
			}
		}
		System.out.println(visit[1]);
	}
}