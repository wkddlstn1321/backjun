import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	static int n;	//정점 개수
	static int m;	//간선 개수
	static int v;	//....
	static int[][] link;	//board
	static int []visit;		//방문 체크
	static Queue<Integer> que = new LinkedList<>();
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		m = sn.nextInt();
		v = sn.nextInt();
		visit = new int [1001];
		link = new int [1001][1001];
		for (int i = 0 ; i < m ; i++){
			int start = sn.nextInt();
			int last = sn.nextInt();

			link[start][last] = 1;
			link[last][start] = 1;
		}
		//1, 2 = 1
		//2, 1 = 1
		dfs(v);
		Arrays.fill(visit, 0);
		System.out.println();
		bfs(v);
	}
	
	private static void dfs(int v) {
		visit[v] = 1;
		System.out.print(v + " ");
		for (int i = 1 ; i <= n ; i++){
			if (link[v][i] == 1 && visit[i] == 0)
				dfs(i);
		}
	}

	private static void bfs(int v2) {
		visit[v] = 1;
		que.offer(v);
		while (!que.isEmpty())
		{
			int save = que.peek();
			que.poll();
			System.out.print(save + " ");
			for (int i = 1 ; i <= n ; i++){
				if (link[save][i] == 1 && visit[i] == 0){
					que.offer(i);
					visit[i] = 1;
				}
			}
		}
	}
}