import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int [][]board = new int[n][n];
		for(int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				board[i][j] = 1;
			}
		}
	}
}