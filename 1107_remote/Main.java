import java.util.Scanner;

public class Main{
	static int []remote;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		remote = new int[10];
		int gojang = sn.nextInt();
		for (int i = 0 ; i < gojang ; i++){
			remote[sn.nextInt()] = 1;
		}
		if (n == 0)
		{
			int i = 0;
			for(i = 0 ; i < 10 ; i++){
				if (remote[i] == 0)
					break;
			}
			if (i == 10)
			{
				System.out.println(100);
				return ;
			}
			else
			{
				System.out.println(i + 1);
				return ;
			}
		}
		int min = Math.abs(n - 100);
		int save = n;
		int check = 0;
		while (n >= 0)
		{
			check = n_check(n);
			if (check == 1)
				break;
			n--;
			if (n > 0)
			{
				n = 10000000;
				break ;
			}
		}
		int bi = n;
		int cnt = 1;
		while (bi >= 10)
		{
			cnt++;
			bi /= 10;
		}
		int a = Math.abs(save - n) + cnt;
		min = a < min ? a : min;
		n = save;
		a = Math.abs(save - n) + cnt;
		while (min > a)
		{
			check = n_check(n);
			if (check == 1)
			{
				min = a;
				break;
			}
			n++;
			bi = n;
			cnt = 1;
			while (bi >= 10)
			{
				cnt++;
				bi /= 10;
			}
			a = Math.abs(save - n) + cnt;
		}
		System.out.println(min);
	}

	private static int n_check(int n) {
		if (n == 0)
		{
			if (remote[0] == 1)
				return (0);
		}
		while (n > 0)
		{
			int a = n % 10;
			if (remote[a] == 1)
				return 0;
			n /= 10;
		}
		return 1;
	}
}