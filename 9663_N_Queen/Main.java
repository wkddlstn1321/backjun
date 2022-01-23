import java.util.Scanner;

public class Main{
	static int cnt;
	static int n;
	static int []board;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		board = new int[n];
		cnt = 0;
		queenCheck(0);
		System.out.println(cnt);
	}
	private static void queenCheck(int x) {
		if (x == n)
		{
			cnt++;
			return ;
		}
		for (int i = 0 ; i < n ; i++)
		{
			board[x] = i;
			if (chrFalse(x))
				continue;
			queenCheck(x + 1);
			board[x] = 0;
		}
	}
	private static boolean chrFalse(int x) {
		for (int i = x - 1 ; i >= 0 ; i--){
			if (board[i] == board[x])
				return true;
			if (Math.abs(x - i) == Math.abs(board[x] - board[i]))
				return true;
		}
		return false;
	}
}