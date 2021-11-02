import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int e = sn.nextInt(); // 15 
		int s = sn.nextInt(); // 28 
		int m = sn.nextInt(); // 19 
		int e1 = 28 * 19;
		int s1 = 15 * 19;
		int m1 = 15 * 28;
		int e2 = (uclid(e1, 15) * e * e1);
		int s2 = (uclid(s1, 28) * s * s1);
		int m2 = (uclid(m1, 19) * m * m1);
		int sum = e2 + s2 + m2;
		int sum1 = 15 * 19 * 28;
		int n = sum % sum1;
		if (n == 0)
			n = 7980;
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