import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		for (int z = 0 ; z < t ; z++){
			int n = sn.nextInt();
			n *= 2;
			int []c = new int[n];
			for (int i = 0 ; i < n ; i++){
				c[i] = sn.nextInt();
			}
			for (int i = 0 ; i < n - 1 ; i++){
				for (int j = i + 1 ; j < n ; j++){
					if (c[i] == 0)
						break;
					if ((c[i] / 3) * 4 == c[j])
					{
						c[j] = 0;
						break ;
					}
				}
			}
			System.out.print("Case #" + (z + 1) + ": ");
			for (int i : c) {
				if (i != 0)
					System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}