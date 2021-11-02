import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		char [][]board = new char[n][n];
		int max = 1;
		int cnt = 0;
		char temp;
		for (int i = 0 ; i < n ; i++){
			String s = sn.next();
			for (int j = 0 ; j < n ; j++){
				board[i][j] = s.charAt(j);
			} 
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0; j < n ; j++){
				if (j != n - 1)
				{
					temp = board[i][j];
					board[i][j] = board[i][j + 1];
					board[i][j + 1] = temp;
					cnt = maxchaeck(board, n);
					temp = board[i][j];
					board[i][j] = board[i][j + 1];
					board[i][j + 1] = temp;
					if (cnt > max)
						max = cnt;
				}
			}
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0; j < n ; j++){
				if (i != n - 1)
				{
					temp = board[i][j];
					board[i][j] = board[i + 1][j];
					board[i + 1][j] = temp;
					cnt = maxchaeck(board, n);
					temp = board[i][j];
					board[i][j] = board[i + 1][j];
					board[i + 1][j] = temp;
					if (cnt > max)
						max = cnt;
				}
			}
		}
		System.out.println(max);
	}

	private static int maxchaeck(char [][]board, int n) {
		int c = 0;
		int p = 0;
		int y = 0;
		int z = 0;
		int maxe = 0;
		for (int i = 0; i < n ; i++){
			c = 0;
			p = 0;
			y = 0;
			z = 0;
			for (int j = 0 ; j < n ; j++){
				if (board[i][j] == 'C')
				{
					p = 0;
					y = 0;
					z = 0;
					c++;
					if (maxe < c)
						maxe = c;
				}
				else if (board[i][j] == 'P')
				{
					c = 0;
					y = 0;
					z = 0;
					p++;
					if (maxe < p)
						maxe = p;
				}
				else if (board[i][j] == 'Y')
				{
					p = 0;
					c = 0;
					z = 0;
					y++;
					if (maxe < y)
						maxe = y;
				}
				else if (board[i][j] == 'Z')
				{
					p = 0;
					y = 0;
					c = 0;
					z++;
					if (maxe < z)
						maxe = z;
				}
			}
		}
		for (int j = 0; j < n ; j++){
			c = 0;
			y = 0;
			z = 0;
			p = 0;
			for (int i = 0 ; i < n ; i++){
				if (board[i][j] == 'C')
				{
					p = 0;
					y = 0;
					z = 0;
					c++;
					if (maxe < c)
						maxe = c;
				}
				else if (board[i][j] == 'P')
				{
					c = 0;
					y = 0;
					z = 0;
					p++;
					if (maxe < p)
						maxe = p;
				}
				else if (board[i][j] == 'Y')
				{
					p = 0;
					c = 0;
					z = 0;
					y++;
					if (maxe < y)
						maxe = y;
				}
				else if (board[i][j] == 'Z')
				{
					p = 0;
					y = 0;
					c = 0;
					z++;
					if (maxe < z)
						maxe = z;
				}
			}
		}
		return maxe;
	}
}
