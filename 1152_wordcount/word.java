import java.util.Scanner;

public class word{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int cnt = 1;
		String c = " ";
		if (word.length() == 1 && word.charAt(0) == c.charAt(0))
			cnt = 0;
		word = word.trim();
		int a = word.length();
		word = word.replace(" ","");
		int b = word.length();
		cnt = a - b + cnt;
		System.out.println(cnt);
	}
}