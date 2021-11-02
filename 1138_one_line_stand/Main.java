import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int []left = new int[n];
		int []answer = new int[n];
		for (int i = 0 ; i < n ; i++){
			left[i] = sn.nextInt();
		}
		for (int i = 0 ; i < n ; i++){
			int num = left[i];
			for (int j = 0 ; j < n ; j++){
				if (num == 0 && answer[j] == 0)
				{
					answer[j] = i + 1;
					break;
				}
				else if (answer[j] == 0)
					num--;
			}
		}
		for (int a : answer)
			System.out.print(a + " ");
	}
}
//4
//1 2 3 4
//2 1 1 0
//4 2 1 3