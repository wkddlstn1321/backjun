import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		int m = in.nextInt();
		int [][] square = new int [n][m];
		for (int i = 0 ; i < n ; i++){
			String number = in.next();
			for (int j = 0 ; j < m ; j++){
				square[i][j] = number.charAt(j) - 48;
			}
		}
		int fo = 0;
		if (n > m)
			fo = m;
		if (n < m)
			fo = n;
		if (n == m)
			fo = n;
		int a = 0;
		int max = 0;
		for (int i = 0 ; i < fo ; i++){
			for (int j = 0 ; j < m ; j++){
				a = calcul(square, i, n, m);
				//System.out.println(i + " : " + a);
				if (a > max)
					max = a;
			}
		}
		System.out.println(max);
	}

	private static int calcul(int[][] s, int idx, int n, int m) {
		for (int i = 0 ; i < n - idx  ; i++){
			for (int j = 0 ; j < m - idx ; j++){
				if (s[i][j] == s[i + idx][j] && s[i][j] == s[i][j + idx] && s[i][j] == s[i + idx][j + idx])
				{
					return (idx + 1) * (idx + 1);
				}
			}
		}
		return 0;
	}
}