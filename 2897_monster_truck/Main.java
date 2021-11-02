import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int R = sn.nextInt();
		int C = sn.nextInt();
		sn.nextLine();
		String [] a = new String [R];
		char [][] s = new char[R][C];
		int [] jucha = new int [5];
		int des = 0;
		for (int i = 0 ; i < 5 ;i++)
			jucha[i] = 0;
		for (int i = 0 ; i < R; i++){
			a[i] = sn.nextLine();
			for(int j = 0 ; j < C ; j++){
			s[i][j] = a[i].charAt(j);
			}
		}
		for (int i = 0 ; i < R - 1 ; i++){
			for (int j = 0 ; j < C - 1; j++)
			{
				des = 0;
				if (s[i][j] == '#' || s[i + 1][j] == '#' || s[i][j + 1] == '#' || s[i + 1][j + 1] == '#')
					continue;
				if (s[i][j] == 'X')
					des++;
				if (s[i + 1][j] == 'X')
					des++;
				if (s[i][j + 1] == 'X')
					des++;
				if (s[i + 1][j + 1] == 'X')
					des++;
				jucha[des]++;
			}
		}
		for (int i = 0 ; i < 5 ; i++)
			System.out.println(jucha[i]);
	}
}