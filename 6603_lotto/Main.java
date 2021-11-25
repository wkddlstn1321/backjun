import java.util.Scanner;

public class Main{
	static StringBuilder sb = new StringBuilder();
	static int []com;
	static int []visit;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		while(true)
		{
			int k = sn.nextInt();
			if (k == 0)
				break ;
			com = new int[k];
			visit = new int[k];
			for (int i = 0 ; i < k ; i++){
				com[i] = sn.nextInt();
			}
			dfs(0,7);
			sb.append("\n");
		}
		System.out.println(sb);
	}
	private static void dfs(int start, int last) {
		int i;
		for (i = start ; i < 6 ; i++){
			if (i != last)
				sb.append(com[i] + " ");
			else {
				if ()
			}
		}
		
		
		
		if (start == com.length - 6)
			return ;
	}
}