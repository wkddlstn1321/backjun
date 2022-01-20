import java.util.*;

public class Main{
	static int visit[];
	static ArrayList<Integer>[] link;
	static int n;

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		int k = sn.nextInt();
		visit = new int [n];
		link = new ArrayList[n];
		int a = 0;
		int b = 0;
		for (int i = 0 ; i < k ; i++){
			a = sn.nextInt();
			b = sn.nextInt();
			link[a].add(b);
			link[b].add(a);
		}
		for (int i = 0 ; i < k ; i++)
			dfs(0, 0);
		System.out.println(0);
	}
	private static void dfs(int v, int cnt) {
		if (cnt == 4)
		{
			System.out.println(1);
			System.exit(0);
		}
		for (int i = 0 ; i < link[v].size() ; i++){
			int x = link[v].get(i);
			if (visit[i] == 0)
			{
				visit[v] = 1;
				dfs(x, cnt + 1);
				visit[v] = 0;
			}
		}
	}
}