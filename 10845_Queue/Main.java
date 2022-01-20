import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int b = 0;
		for (int i = 0 ; i < n ; i++)
		{
			String s = sn.next();
			switch (s) {
				case "push":
					int x = sn.nextInt();
					b = x;
					q.offer(x);
					break;
				
				case "pop":
					if (q.isEmpty())
						System.out.println(-1);
					else
						System.out.println(q.poll());
					break;
				
				case "size":
					System.out.println(q.size());
					break;
				
				case "empty":
					if (q.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				
				case "front":
					if (q.isEmpty())
						System.out.println(-1);
					else
						System.out.println(q.peek());
					break;
				
				case "back":
					if (q.isEmpty())
						System.out.println(-1);
					else
						System.out.println(b);
					break;
			}
		}
	}
}