import java.util.Scanner;

public class Main{
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		n = sn.nextInt();
		m = sn.nextInt();
		int [][]board = new int[n][m];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				board[i][j] = sn.nextInt();
			}
		}
		int max = 0;
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				if (max < cnt(board, i, j))
					max = cnt(board, i, j);
			}
		}
		System.out.println(max);
	}

	private static int cnt(int[][] board, int s, int g) {
		int max = 0;
		int sum = 0;
		int [][]dirx = {{0, 1, 2, 3}, {0, 0, 0, 0},		//1자
						{0, 0, 1, 1},					//사각
						{0, 1, 1, 2}, {0, 1, 1, 2},		//손가락
						{0, 0, 0, 1}, {0, 1, 1, 1},		//손가락
						{0, 0, 1, 1}, {1, 1, 0, 0}, {0, 1, 1, 2}, {1, 2, 0, 1},
						{0,0,0,1},{0,1,1,1},
						{0,0,0,1},{0,1,1,1},
						{0,0,1,2},{0,1,2,2},
						{0,0,1,2},{0,1,2,2}
					};
		int [][]diry = {{0, 0, 0, 0},{0, 1, 2, 3},
						{0, 1, 0, 1},
						{0, 0, 1, 0}, {1, 0, 1, 1},
						{0, 1, 2, 1}, {1, 0, 1, 2},
						{0, 1, 1, 2}, {0, 1, 1, 2}, {0, 0, 1, 1}, {0, 0, 1, 1},
						{0,1,2,2},{2,2,1,0},
						{0,1,2,0},{0,0,1,2},
						{0,1,0,0},{0,0,0,1},
						{0,1,1,1},{1,1,1,0}
					};
		for (int i = 0 ; i < 19 ; i++){
			sum = 0;
			for (int j = 0 ; j < 4 ; j++){
				int x = g + dirx[i][j];
				int y = s + diry[i][j];
				if (y >= 0 && x >= 0 && y < n && x < m)
				{
					sum += board[y][x];
				}
			}
			if (max < sum)
				max = sum;
		}
		return max;
	}
}