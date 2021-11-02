import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pay = scan.nextInt();
		int [] change = {500, 100, 50, 10, 5, 1};
		int mon = 1000 - pay;
		int cnt = 0;

		for (int i = 0 ; i < 6 ; i++){
			if (mon < change[i])
				continue;
			cnt += mon / change[i];
			mon %= change[i];
		}
		System.out.println(cnt);
	}
}
	// int a = 0, b = 0, result = 0;
	// scanf("%d", &a);
	// b = 1000 - a;
	// while (b != 0) {
	// 	if (b >= 500)
	// 	{
	// 		result++;
	// 		b -= 500;
	// 	}
	// 	else if (b >= 100)
	// 	{
	// 		result++;
	// 		b -= 100;
	// 	}
	// 	else if (b >= 50)
	// 	{
	// 		result++;
	// 		b -= 50;
	// 	}
	// 	else if (b >= 10)
	// 	{
	// 		result++;
	// 		b -= 10;
	// 	}
	// 	else if (b >= 5)
	// 	{
	// 		result++;
	// 		b -= 5;
	// 	}
	// 	else if (b >= 1)
	// 	{
	// 		result++;
	// 		b -= 1;
	// 	}
	// }