import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int k = sn.nextInt();
		int n = sn.nextInt();
		long []ran = new long[k];
		long min = 0;
		long mid;
		long max = 0;
		for (int i = 0 ; i < k ; i++){
			ran[i] = sn.nextInt();
			if (max < ran[i])
				max = ran[i];
		}
		max++;
		while (min + 1 < max)
		{
			mid = (min + max) / 2;
			long cnt = 0;
			for (int i = 0 ; i < k ; i++){
				cnt += ran[i] / mid;
			}
			if (cnt < n)
				max = mid;
			else
				min = mid;
		}
		System.out.println(min);
	}
}