import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int k = sn.nextInt();
		int []visit = new int[100002];
		Queue<Integer> q = new LinkedList<>();
		if (k <= n)
		{
			System.out.println(n - k);
			System.exit(0);
		}
		visit[n] = 1;
		q.offer(n);
		while (!q.isEmpty())
		{
			int nb = q.poll();
			int nb2 = 0;
			for (int i = 0 ; i < 3 ; i++){
				if (i == 0){
					nb2 = nb + 1;
				}
				if (i == 1){
					nb2 = nb - 1;
				}
				if (i == 2){
					nb2 = nb * 2;
				}
				if (nb2 >= 0 && nb2 <= 100000 && visit[nb2] == 0){
					q.offer(nb2);
					visit[nb2] = visit[nb] + 1;
				}
			}
		}
		System.out.println(visit[k] - 1);
	}
}