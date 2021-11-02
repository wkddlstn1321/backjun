import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = -1;
		int p = -1;
		int v = -1;
		int i = 1;
		int j = 1;
		while (j == 1)
		{
			l = sc.nextInt();
			p = sc.nextInt();
			v = sc.nextInt();
			if (l == 0 && p == 0 && v == 0)
				System.exit(0);
			int a = v % p;
			int sum = 0;
			if (a > l)
				sum = ((v / p) * l) + l;
			else if (a <= l)
				sum = ((v / p) * l) + a;
			System.out.println("Case " + i +" : " + sum);
			i++;
		}
	}
}