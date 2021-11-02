import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int []a = new int [n];
		int []b = new int [n];
		int []c = new int [n];
		for (int i = 0 ; i < n ; i++) {
			a[i] = sn.nextInt();
		}
		for (int i = 0 ; i < n ; i++) {
			b[i] = sn.nextInt();
		}
		c = b;
		Arrays.sort(a);
		Arrays.sort(c);
		int temp;
		for (int i = 0 ; i < n / 2 ; i++){
			temp = c[i];
			c[i] = c[n - 1 - i];
			c[n - 1 -i] = temp;
		}
		int sum = 0;
		for (int i = 0 ; i < n ; i++){
			sum += a[i] * c[i];
		}
		System.out.println(sum);
	}
}