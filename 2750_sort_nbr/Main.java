import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int	n = sn.nextInt();
		int [] ary = new int[n];
		for (int i = 0; i < n ;i++){
			ary[i] = sn.nextInt();
		}
		int temp = 0;
		for (int i = 0 ; i < n ; i++){
			for (int j = i + 1 ; j < n ; j++){
				if (ary[i] > ary[j])
				{
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}
		for (int i = 0 ; i < n ; i++) {
			System.out.println(ary[i]);
		}
	}
}