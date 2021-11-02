import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		long s = sn.nextLong();
		int i = 1;
		int j = 2;
		while (true)
		{
			s -= j;
			if (s <= 0)
			{
				System.out.println(i);
				System.exit(0);
			}
			i++;
			j++;
		}
	}
}

// 1 = 1
// 2 = 2
// 3 = 1 2
// 4 = 1 3
// 5 = 1 4
// 6 = 1 2 3
// 7 = 1 2 4
// 8 = 1 2 5
// 9 = 1 2 6	
// 10 = 1 2 3 4
// 11 = 1 2 3 5
// 12 = 1 2 3 6
// 13 = 1 2 3 7
// 14 = 1 2 3 8
// 15 = 1 2 3 4 5
// 16 = 1 2 3 4 6
// 17 = 1 2 3 4 7
// 18 = 1 2 3 4 8
// 19 = 1 2 3 4 9
// 20 = 1 2 3 4 10
// 21 = 1 2 3 4 5 6