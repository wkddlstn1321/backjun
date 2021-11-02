import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int k = sn.nextInt();
		Queue <Integer> q = new LinkedList<>();
		for (int i = 1 ; i <= n ; i++){
			q.add(i);
		}
		int w = 1;
		System.out.print("<");
		if (k == 1)
		{
			for (int i = 1 ; i <= n - 1 ; i++){
				System.out.print(i + ", ");
			}
			System.out.println(n + ">");
			return ;
		}
		while (q.size() != 1)
		{
			int p = q.peek();
			q.poll();
			q.add(p);
			w++;
			if (w == k)
			{
				System.out.print(q.poll() + ", ");
				w = 1;
			}
		}
		System.out.print(q.peek() + ">");
	}
}