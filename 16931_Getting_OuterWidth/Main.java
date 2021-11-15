import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int m = sn.nextInt();
		int [][]sq = new int[n][m];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				sq[i][j] = sn.nextInt();
			}
		}
		int uop = underoverplus(sq);
		int []outer = new int[4];
		for (int i = 0 ; i < 4 ; i++){
			outer[i] = outerWidth(sq);
			sq = rotate(sq, sq.length, sq[0].length);
		}
		int sum = 0;
		for (int i : outer) { 
			sum += i;
		}
		sum += uop;
		System.out.println(sum);
	}

	private static int[][] rotate(int[][]sq, int n, int m) {
		int [][]rot = new int[m][n];
		for (int i = 0; i < m ; i++){
			for (int j = 0 ; j < n ; j++){
				rot[i][j] = sq[j][m - 1 - i];
			}
		}
		return rot;
	}

	private static int outerWidth(int [][]sq) {
		int sum = 0;
		for (int i = 0 ; i < sq.length ; i++){
			int max = 0;
			for (int j = 0 ; j < sq[i].length ; j++){
				if (max < sq[i][j]){
					sum += sq[i][j] - max;
				}
				max = sq[i][j];
			}
		}
		return sum;
	}

	private static int underoverplus(int [][]sq) {
		int sum = 0;
		for (int i = 0 ; i < sq.length ; i++){
			for (int j = 0 ; j < sq[i].length ; j++){
				if (sq[i][j] > 0)
					sum++;
			}
		}
		return sum * 2;
	}
}