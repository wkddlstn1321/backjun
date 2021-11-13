import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int []dwarfs = new int [9];
		int sum = 0;
		for (int i = 0 ; i < 9 ; i++){
			dwarfs[i] = sn.nextInt();
			sum += dwarfs[i];
		}
		int diff = sum - 100;
		for (int i = 0 ; i < 8 ; i++){
			for (int j = i + 1 ; j < 9 ; j++){
				if (dwarfs[i] + dwarfs[j] == diff)
				{
					dwarfs[i] = 0;
					dwarfs[j] = 0;
					break ;
				}
			}
			if (dwarfs[i] == 0)
				break ;
		}
		Arrays.sort(dwarfs);
		for (int i = 2 ; i < 9 ; i++){
			System.out.println(dwarfs[i]);
		}
	}
}