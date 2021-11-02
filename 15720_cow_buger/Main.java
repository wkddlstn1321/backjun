import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int [] buger = new int [B];
		int [] side = new int [C];
		int [] drink = new int [D];
		int price = 0;
		for (int i = 0 ; i < B ; i++){
			buger[i] = scan.nextInt();
			price += buger[i];
		}
		for (int i = 0 ; i < C ; i++){
			side[i] = scan.nextInt();
			price += side[i];
		}
		for (int i = 0 ; i < D ; i++){
			drink[i] = scan.nextInt();
			price += drink[i];
		}
		Arrays.sort(buger);
		Arrays.sort(side);
		Arrays.sort(drink);
		int temp = 0;
		for (int i = 0 ; i < B / 2 ; i++){
			temp = buger[i];
			buger[i] = buger[B - 1 - i];
			buger[B - 1 - i] = temp;
		}
		for (int i = 0 ; i < C/2 ; i++){
			temp = side[i];
			side[i] = side[C - 1 - i];
			side[C - 1 - i] = temp;
		}
		for (int i = 0 ; i < D/2 ; i++){
			temp = drink[i];
			drink[i] = drink[D - 1 - i];
			drink[D - 1 - i] = temp;
		}
		int set = B;
		if (set > C)
			set = C;
		if (set > D)
			set = D;
		int sum = 0;
		for (int i = 0; i < set ; i++){
			sum += (buger[i] + side[i] + drink[i]) * 0.1;
		}
		System.out.println(price);
		System.out.println(price - sum);
	}
}