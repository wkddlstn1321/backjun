import java.util.Scanner;

public class Main{
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		m = sn.nextInt();
		int [][]board = new int[n][m];
		for (int i = 0 ; i < 3 ; i++){
			int q = sn.nextInt();
			for (int j = 0 ; j < q ; j++){
				int x = sn.nextInt() - 1;
				int y = sn.nextInt() - 1;
				board[x][y] = i + 1;
			}
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				if (board[i][j] == 1)
					q_check(board, i, j);
				if (board[i][j] == 2)
					k_check(board, i, j);
			}
		}
		int sum = 0;
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				if (board[i][j] == 0)
					sum++;
			}
		}
		System.out.println(sum);
	}

	private static void k_check(int[][] board, int x, int y) {
		int []dirx = {2, 2, -2, -2, 1, -1, 1, -1};
		int []diry = {1, -1, 1, -1, 2, 2, -2, -2};
		for (int i = 0 ; i < 8 ; i++){
			int x2 = x - dirx[i];
			int y2 = y - diry[i];
			if (x2 >= 0 && y2 >= 0 && x2 < n && y2 < m)
			{
				if (board[x2][y2] == 0)
					board[x2][y2] = -1;
			}
		}
	}

	private static void q_check(int[][] board, int x, int y) {
		for (int i = 1 ; i < n ; i++){
			if (x - i >= 0 && y - i >= 0)
			{
				if (board[x - i][y - i] == 0 || board[x - i][y - i] == -1)
					board[x - i][y - i] = -1;
				else
					i = n;
			}
			else
				break ;
		}
		for (int i = 1 ; i < m ; i++){
			if (y + i < m && x + i < n)
			{
				if (board[x + i][y + i] == 0 || board[x + i][y + i] == -1)
					board[x + i][y + i] = -1;
				else
					i = m;
			}
			else
				break ;
		}
		for (int i = 1 ; i < n ; i++){
			if (x + i < n && y - i >= 0)
			{
				if (board[x + i][y - i] == 0 || board[x + i][y - i] == -1)
					board[x + i][y - i] = -1;
				else
					i = n;
			}
			else
				break ;
		}
		for (int i = 1 ; i < m ; i++){
			if (y + i < m && x - i >= 0)
			{
				if (board[x - i][y + i] == 0 || board[x - i][y + i] == -1)
					board[x - i][y + i] = -1;
				else
					i = m;
			}
			else
				break ;
		}

		for (int i = 1 ; i < n ; i++){
			if (x - i >= 0)
			{
				if (board[x - i][y] == 0 || board[x - i][y] == -1)
					board[x - i][y] = -1;
				else
					i = n;
			}
			else
				break ;
		}
		for (int i = 1 ; i < m ; i++){
			if (y - i >= 0)
			{
				if (board[x][y - i] == 0 || board[x][y - i] == -1)
					board[x][y - i] = -1;
				else
					i = m;
			}
			else
				break ;
		}
		for (int i = 1 ; i < n ; i++){
			if (x + i < n)
			{
				if (board[x + i][y] == 0 || board[x + i][y] == -1)
					board[x + i][y] = -1;
				else
					i = n;
			}
			else
				break ;
		}
		for (int i = 1 ; i < m ; i++){
			if (y + i < m)
			{
				if (board[x][y + i] == 0 || board[x][y + i] == -1)
					board[x][y + i] = -1;
				else
					i = m;
			}
			else
				break ;
		}
	}
}