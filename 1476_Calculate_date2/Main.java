import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		long e;//15
		long s;//28
		long m;//19
		Scanner sn = new Scanner(System.in);
		e = sn.nextInt();
		s = sn.nextInt();
		m = sn.nextInt();
		System.out.println(ChineseRemainder(ChineseRemainder(e, s, 15 , 28), m, 15*28,19));
	}
	private static long ChineseRemainder(long a, long b, long c, long d) {
		long answer = (a * InverseModula(d, c) * d + b * InverseModula(c, d) * c) % (c * d);
		long exception = 7980;
		if (answer == 0)
			return exception;
		else
			return answer;
	}
	private static long InverseModula(long a, long b) {
		long r1, r2, q, r, t, t1, t2;
		r1 = a;
		r2 = b;
		t1 = 0; t2 = 1;
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
// #include<iostream>
// using namespace std;
// long InverseModula(long a, long b)
// {
//    long r1, r2, q, r, t, t1, t2;
//    r1 = a;
//    r2 = b;
//    t1 = 0; t2 = 1;

//    while (r1 != 1)
//    {
//       q = r2 / r1;
//       r = r2 - r1 * q;
//       t = t1 - t2 * q;
//       r2 = r1;
//       r1 = r;
//       t1 = t2;
//       t2 = t;
//    }
//    if (t2 < 0)
//       t2 = t2 + b;
//    return t2;
// }

// long ChineseRemainder(long a, long b,long c,long d)
// {
//    int answer = (a * InverseModula(d, c) * d + b * InverseModula(c, d) * c) % (c * d);
//    int exception = 7980;
//    if (answer == 0)
//       return exception;
//    else
//       return answer;

// }


// int main()
// {
//    long e;//15
//    long s;//28
//    long m;//19

//    cin >>e>>s>>m;
//    cout<<ChineseRemainder(ChineseRemainder(e, s, 15 , 28), m, 15*28,19)<<endl;

// }