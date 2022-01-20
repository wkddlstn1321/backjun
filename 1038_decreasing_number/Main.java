import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int []dec = new int [n + 1];
		int start = 0;
		for (int i = 0 ; i <= n ; i++){
			start = next_dec(start);
			dec[i] = start;
			start++;
		}
		System.out.println(dec[n]);
	}

	private static int next_dec(int start) {
		String s = Integer.toString(start);
		int len = s.length();
		if (len == 1)
			return start;
		
		return (start);
	}
}