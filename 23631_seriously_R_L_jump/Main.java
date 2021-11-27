import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		for (int i = 0 ; i < t ; i++){
			int n = sn.nextInt();
			int k = sn.nextInt();
			int dir = 0;
			while (n - k > 0)
			{
				n -= k;
				k *= 2;
				dir++;
				System.out.print(n + " ");
				System.out.println(k);
			}
			System.out.println((k - n));
		}
	}
}