import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int []a = new int [n];
		for (int i = 0; i < n; i++){
			a[i] = sn.nextInt();
		}
		long sum = 0;
		Arrays.sort(a);
		for (int i = 0; i < n ; i++){
			int tip = a[n - 1 - i] - i;
			if (tip >= 0)
				sum += tip;
		}
		System.out.println(sum);
	}
}