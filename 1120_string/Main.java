import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String a = sn.next();
		String b = sn.next();
		int diff = a.length();
		for (int i = 0 ; i <= b.length() - a.length() ; i++){
			int d = 0;
			for (int j = 0 ; j < a.length() ; j++){
				if (a.charAt(j) != b.charAt(i + j))
					d++;
			}
			if (diff > d)
				diff = d;
		}
		System.out.println(diff);
	}
}