import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int J = scan.nextInt();
		int move = 0;
		int start = 1;
		int last = M;
		int a = 0;
		for (int i = 0 ; i < J ; i++){
			a = scan.nextInt();
			if (a > N)
				continue;
			else if (a > last)
			{
				move += a - last;
				start += a - last;
				last = a;
			}
			else if (start > a)
			{
				move += start - a;
				last -= start - a;
				start = a;
			}
		}
		System.out.println(move);
	}
}