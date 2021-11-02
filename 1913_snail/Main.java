import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sn.nextInt();
		int a = sn.nextInt();
		int []jungdap = {0,0};
		int [][] board = new int[n][n];
		int start1 = n / 2;
		int start2 = n / 2;
		int index = 2;
		int key = 1;
		board[start1][start2] = 1;
		while (index <= n * n){
			for (int i = 0; i < key ; i++){
				start1 -= 1;
				board[start1][start2] = index;
				index++;
				if (index > n * n)
					break ;
			}
			for (int i = 0; i < key ; i++){
				if (index > n * n)
					break ;
				start2 += 1;
				board[start1][start2] = index;
				index++;
			}
			key++;
			for (int i = 0; i < key ; i++){
				if (index > n * n)
					break ;
				start1 += 1;
				board[start1][start2] = index;
				index++;
			}
			for (int i = 0; i < key ; i++){
				if (index > n * n)
					break ;
				start2 -= 1;
				board[start1][start2] = index;
				index++;
			}
			key++;
		}
		for (int i = 0 ; i < n ; i++){
			for (int j = 0 ; j < n ; j++){
				if (a == board[i][j])
				{
					jungdap[0] = i + 1;
					jungdap[1] = j + 1;
				}
				sb.append(board[i][j] + " ");
			}
			sb.append("\n");
		}
		sb.append(jungdap[0] + " " + jungdap[1]);
		System.out.println(sb);
	}
}
//up 1 right 1 down 2 left 2
//up 3 right 3 down 4 left 4
//up 5 right 5 down 6 left 6
//up 7 

// up = 	i++
// right =	j++
// down =	i--;
// left =	j--;