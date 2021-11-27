import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		int m = sn.nextInt();
		int n = sn.nextInt();
		for (int i = m ; i <= n ; i++){
			int j = 2;
			int pri = 0;
			for (j = 2 ; j <= i / j ; j++){
				if (i % j == 0){
					pri = 1;
					break ;
				}
			}
			if (i == 1)
				pri = 1;
			if (pri == 0)
				System.out.println(i);
		}
	}
}