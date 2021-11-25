import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int sum = 665;
		String str;
		for (int i = 0 ; i < n ; i++){
			sum++;
			while (true)
			{
				str = Integer.toString(sum);
				if (thr_six(str))
					break;
				sum++;
			}
		}
		System.out.println(sum);
	}

	private static boolean thr_six(String str) {
		for (int i = 1 ; i < str.length() - 1 ; i++){
			if (str.charAt(i - 1) == '6' && str.charAt(i) == '6' && str.charAt(i + 1) == '6')
				return true;
		}
		return false;
	}
}