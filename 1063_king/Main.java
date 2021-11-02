import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int [][]board = new int[8][8];
		String []cmd = {"R","L","B","T","RT","LT","RB","LB"};
		for (int i = 0; i < 8 ; i++){
			for (int j = 0 ; j < 8 ; j++){
				board[i][j] = 8 - i;
			}
		}
		String k = sn.next();
		String d = sn.next();
		int n = sn.nextInt();
		String movecmd;				//이동 명령어
		int []move = new int [2];   //king 이동 좌표 저장
		int []move2 = new int [2];  //돌	이동 좌표 저장
		int k1 = colfind(k);		//king 세로 구하기
		int k2 = rowfind(k);		//king 가로 구하기
		int d1 = colfind(d);		//돌    가로 구하기
		int d2 = rowfind(d);		//돌    세로 구하기
		for (int i = 0 ; i < n ; i++){
			movecmd = sn.next();
			for (int j = 0 ; j < 8 ; j++){
				if (cmd[j].equals(movecmd))
				{
					move = moving(j,k1,k2);
					if (move[0] == d1 && move[1] == d2)
					{
						move2 = moving(j, d1, d2);
						if (move2[0] != d1 || move2[1] != d2)
						{
							k1 = move[0];
							k2 = move[1];
							d1 = move2[0];
							d2 = move2[1];
						}
					}
					else
					{
						k1 = move[0];
						k2 = move[1];
					}
					System.out.println((char) ('A' + k2) + "" + (8 - k1));
					System.out.println((char) ('A' + d2) + "" + (8 - d1));
				}
			}
		}
		char a = (char) ('A' + k2);
		char a2 = (char) ('A' + d2);
		System.out.println(a + "" + (8 - k1));
		System.out.println(a2 + "" + (8 - d1));
	}
	private static int[] moving(int j, int a, int b) {
		int []move = {a, b};
		if (j == 0)
		{
			if (b + 1 < 8)
				b += 1;
		}
		else if (j == 1)
		{
			if (b - 1 >= 0)
				b -= 1;
		}
		else if (j == 2)
		{
			if (a + 1 < 8)
				a += 1;
		}
		else if (j == 3)
		{
			if (a - 1 >= 0)
				a -= 1;
		}
		else if (j == 4)
		{
			if (a - 1 >= 0 && b + 1 < 8)
			{
				a -= 1;
				b += 1;
			}
		}
		else if (j == 5)
		{
			if (a - 1 >= 0 && b - 1 >= 0)
			{
				a -= 1;
				b -= 1;
			}
		}
		else if (j == 6)
		{
			if (a + 1 < 8 && b + 1 < 8)
			{
				a += 1;
				b += 1;
			}
		}
		else if (j == 7)
		{
			if (a + 1 < 8 && b - 1 >= 0)
			{
				a += 1;
				b -= 1;
			}
		}
		move[0] = a;
		move[1] = b;
		return (move);
	}

	private static int colfind(String s) {
		for (int i = 0 ; i < 8 ;i++){
			if (8 - i == s.charAt(1) - 48)
			{
				return i;
			}
		}
		return -1;
	}	

	private static int rowfind(String s) {
		for (int i = 0 ; i < 8 ;i++){
			if ((char) ('A' + i) == s.charAt(0))
			{
				return i;
			}
		}
		return -1;
	}
}
//   A B C D E F G H
//                      
//8  8 8 8 8 8 8 8 8   0
//7  7 7 7 7 7 7 7 7   1
//6  6 6 6 6 6 6 6 6   2
//5  5 5 5 5 5 5 5 5   3
//4  4 4 4 4 4 4 4 4   4
//3  3 3 3 3 3 3 3 3   5
//2  2 2 2 2 2 2 2 2   6
//1  1 1 1 1 1 1 1 1   7
//                     
//   0 1 2 3 4 5 6 7   
// board[i][j];