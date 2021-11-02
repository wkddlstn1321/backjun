import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int []stu = new int[30];
		for (int i = 0 ; i < 28 ; i++){
			int nb = sn.nextInt();
			stu[nb - 1] = nb;
		}
		int x = 0;
		int y = 0;
		for (int i = 0 ; i < 30 ; i++){
			if (stu[i] == 0){
				if (x == 0){
					x = i + 1;
				}
				y = i + 1;
			}
		}
		if (x > y){
			System.out.println(y);
			System.out.println(x);
		}
		else {
			System.out.println(x);
			System.out.println(y);
		}
	}
}