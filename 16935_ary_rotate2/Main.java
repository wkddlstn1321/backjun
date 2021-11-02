import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main (String[] args) throws IOException {
		//Scanner sn = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int [][]arr = new int [n][m];
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0 ; i < r ; i++){
			int cmd = Integer.parseInt(st.nextToken());
			if (cmd == 1)
				onecmd(arr, n, m);
			if (cmd == 2)
				twocmd(arr, n, m);
			if (cmd == 3)
			{
				arr = thrcmd(arr, n, m);
				n = arr.length;
				m = arr[i].length;
			}
			if (cmd == 4)
			{
				arr = foucmd(arr, n, m);
				n = arr.length;
				m = arr[i].length;
			}
			if (cmd == 5)
				arr = fivcmd(arr, n, m);
			if (cmd == 6)
				arr = sixcmd(arr, n, m);
			
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < m ; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void onecmd(int[][] arr, int n, int m) {
		int []temp = new int[m];
		for (int i = 0 ; i < n / 2 ; i++){
			temp = arr[i].clone();						//clone : 깊은 복사
			arr[i] = arr[n - 1 - i].clone();
			arr[n - 1 -i] = temp.clone();
		}
	}

	private static void twocmd(int[][] arr, int n, int m){
		int []cp = new int[m];
		for (int i = 0 ; i < n ; i++){
			for (int j = m - 1 , idx = 0 ; j >= 0 ; j-- , idx++){
				cp[idx] = arr[i][j];
			}
			arr[i] = cp.clone();
		}
	}

	private static int[][] thrcmd(int[][] arr, int n, int m) {
		int [][]rot = new int[m][n];
		for (int i = 0; i < m ; i++){
			for (int j = 0 ; j < n ; j++){
				rot[i][j] = arr[n - 1 - j][i];
			}
		}
		return rot;
	}

	private static int[][] foucmd(int[][] arr, int n, int m) {
		int [][]rot = new int[m][n];
		for (int i = 0; i < m ; i++){
			for (int j = 0 ; j < n ; j++){
				rot[i][j] = arr[j][m - 1 - i];
			}
		}
		return rot;
	}

	private static int[][] fivcmd(int[][] arr, int n, int m) {
		int [][]temp1 = new int[n / 2][m / 2];
		int [][]temp2 = new int[n / 2][m / 2];
		int [][]temp3 = new int[n / 2][m / 2];
		int [][]temp4 = new int[n / 2][m / 2];
		for (int i = 0 ; i < n / 2 ; i++){
			temp1[i] = Arrays.copyOf(arr[i], m / 2);
			temp2[i] = Arrays.copyOfRange(arr[i], m / 2, m);
			temp3[i] = Arrays.copyOfRange(arr[n / 2 + i], m / 2, m);
			temp4[i] = Arrays.copyOf(arr[n / 2 + i], m / 2);
		}
		for (int i = 0 ; i < n / 2 ; i++){
			for (int j = 0 ; j < m / 2 ;j++){
				arr[i][j] = temp4[i][j];
				arr[i][j + m / 2] = temp1[i][j];
				arr[i + n / 2][j] = temp3[i][j];
				arr[i + n / 2][j + m / 2] = temp2[i][j];
			}
		}
		return arr;
	}

	private static int[][] sixcmd(int[][] arr, int n, int m) {
		int [][]temp1 = new int[n / 2][m / 2];
		int [][]temp2 = new int[n / 2][m / 2];
		int [][]temp3 = new int[n / 2][m / 2];
		int [][]temp4 = new int[n / 2][m / 2];
		for (int i = 0 ; i < n / 2 ; i++){
			temp1[i] = Arrays.copyOf(arr[i], m / 2);
			temp2[i] = Arrays.copyOfRange(arr[i], m / 2, m);
			temp3[i] = Arrays.copyOfRange(arr[n / 2 + i], m / 2, m);
			temp4[i] = Arrays.copyOf(arr[n / 2 + i], m / 2);
		}
		for (int i = 0 ; i < n / 2 ; i++){
			for (int j = 0 ; j < m / 2 ;j++){
				arr[i][j] = temp2[i][j];
				arr[i][j + m / 2] = temp3[i][j];
				arr[i + n / 2][j] = temp1[i][j];
				arr[i + n / 2][j + m / 2] = temp4[i][j];
			}
		}
		return arr;
	}
}
// 0 1 0 1
// 1 1 2 2  2 2 3 3
// 1 1 2 2  2 2 3 3 
// 4 4 3 3  1 1 4 4 
// 4 4 3 3  1 1 4 4 