import java.util.Scanner;

public class white{
	public static void main(String[] args) {
		String [] chese = new String [8];
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		for (int i = 0; i < 8 ; i++){
			chese[i] = scan.nextLine();
		}
		for (int i = 0; i < 8 ; i++){
			for (int a  = i % 2; a < 8 ; a++){
				if (chese[i].charAt(a) == 'F')
					cnt++;
				a++;
			}
		}
		System.out.println(cnt);
	}
}