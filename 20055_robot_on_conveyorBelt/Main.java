import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int rn = n;
		n *= 2;
		int k = sn.nextInt();
		int []con = new int[n];
		int []rob = new int[rn];
		for (int i = 0 ; i < n ; i++){
			con[i] = sn.nextInt();
		}
		int stage = 1;
		int check;
		while (true)
		{
			one_s(con, n);
			one_s(rob, rn);
			two_s(con, rob, rn);
			thr_s(con, rob);
			check = fou_s(con, k, n);
			if (check <= 0)
				break ;
			stage++;
		}
		System.out.println(stage);
	}

	private static int fou_s(int[] con, int k, int n) {
		int sum = 0;
		for (int i = 0 ; i < n ; i++){
			if (con[i] == 0)
				sum++;
		}
		return k - sum;
	}

	private static void thr_s(int[] con, int[] rob) {
		if (con[0] != 0)
		{
			rob[0] = 1;
			con[0]--;
		}
	}

	private static void two_s(int []con, int []rob, int n) {
		for (int i = n - 2 ; i > 0 ; i--){
			if (rob[n - 1] == 1)
				rob[n - 1] = 0;
			if (rob[i] == 1){
				if (rob[i + 1] == 0 && con[i + 1] != 0){
					rob[i] = 0;
					rob[i + 1] = 1;
					con[i + 1] -= 1;
				}
			}
		}
	}

	private static void one_s(int []con, int n) {
		int temp;
		for (int i = n - 1 ; i > 0 ; i--){
			temp = con[i];
			con[i] = con[i - 1];
			con[i - 1] = temp;
		}
	}
}