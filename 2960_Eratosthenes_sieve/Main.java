import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int k = sn.nextInt();
		boolean []a = new boolean[n + 1];
		a[0] = true;
		a[1] = true;
		int cnt = 0;
		int i = 2;
		int j = 1;
		while(true)
		{
			if (i * j > n)
			{
				i++;
				j = 1;
			}
			if (!a[i * j])
			{
				a[i * j] = true;
				cnt++;
			}
			if (cnt == k)
			{
				System.out.println((i * j));
				break;
			}
			j++; 
		}
	}
}