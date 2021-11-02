import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int k = sn.nextInt();
		int s = 1;
		int s1 = 1;
		for (int i = 0 ; i < k ; i++){
			s *= (n - i);
		}
		for (int i = 0 ; i < k ; i++){
			s1 *= (k - i);
		}
		System.out.println(s/s1);
	}
}