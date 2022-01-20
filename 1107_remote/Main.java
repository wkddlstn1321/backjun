import java.util.Scanner;

public class Main{
	static String s;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int m = sn.nextInt();
		int min = n - 100 > 0 ? n - 100 : 100 - n;;
		if (m == 10)
		{
			System.out.println(min);
			System.exit(0);
		}
		int []delete = new int[m];
		int []remote = new int[10 - m];
		for (int i = 0 ; i < m ; i++){
			int a = sn.nextInt();
			delete[i] = a;
		}
		s = Integer.toString(n);
	}
}
//Integer.parseInt(s);