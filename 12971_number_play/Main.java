import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int p1 = sn.nextInt();
		int p2 = sn.nextInt();
		int p3 = sn.nextInt();
		int x1 = sn.nextInt(); //e
		int x2 = sn.nextInt(); //s
		int x3 = sn.nextInt(); //m
		int e1 = p2 * p3;
		int s1 = p1 * p3;
		int m1 = p1 * p2;
		int e2 = (uclid(e1, p1) * x1 * e1);
		int s2 = (uclid(s1, p2) * x2 * s1);
		int m2 = (uclid(m1, p3) * x3 * m1);
		if (e2 < 0 || s2 < 0 || m2 < 0)
		{
			System.out.println(-1);
			return ;
		}
		long sum = e2 + s2 + m2;
		long sum1 = p1 * p2 * p3;
		long n = sum % sum1;
		if (n == 0)
			n = sum1;
		if (n >= 1000000000)
		{
			System.out.println(-1);
			return ;
		}
		System.out.println(n);
	}

	private static int uclid(int a, int b) {
		int r1;
		int r2;
		int q;
		int r;
		int t;
		int t1;
		int t2;
		r1 = a;
		r2 = b;
		t1 = 0; 
		t2 = 1;
		while (r1 != 1)
		{
			if (r1 == 0)
				return -1;
			q = r2 / r1;
			r = r2 - r1 * q;
			t = t1 - t2 * q;
			r2 = r1;
			r1 = r;
			t1 = t2;
			t2 = t;
		}
		if (t2 < 0)
		   t2 = t2 + b;
		return t2;
	}
}