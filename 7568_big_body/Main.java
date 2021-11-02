import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int [][]body_list = new int[n][n];
		int []body_ranking = new int[n];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < 2 ; j++){
				body_list[i][j] = sn.nextInt();
			}
		}
		int []temp = new int[2];
		for (int i = 0 ; i < n ; i++){
			temp = body_list[0];
			body_list[0] = body_list[i];
			body_list[i] = temp;
			body_ranking[i] = bodycheck(body_list,n);
		}
		for (int i = 0 ; i < n ; i++){
			System.out.print(body_ranking[i] + " ");
		}
	}

	private static int bodycheck(int [][]list, int n) {
		int rank = 1;
		for (int i = 0 ; i < n - 1 ; i++){
			if (list[0][0] < list[i + 1][0] && list[0][1] < list[i + 1][1])
				rank++;
		}
		return rank;
	}
}