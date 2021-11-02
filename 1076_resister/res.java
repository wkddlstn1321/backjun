import java.util.Scanner;

public class res{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] f = new String[2];
		String f1;
		int [] a = new int[2];
		long ze = 0;
		for (int i = 0 ; i < 2 ; i++){
			f[i] = in.nextLine();
			if (f[i].equals("black"))
				a[i] = 0;
			else if (f[i].equals("brown"))
				a[i] = 1;
			else if (f[i].equals("red"))
				a[i] = 2;
			else if (f[i].equals("orange"))
				a[i] = 3;
			else if (f[i].equals("yellow"))
				a[i] = 4;
			else if (f[i].equals("green"))
				a[i] = 5;
			else if (f[i].equals("blue"))
				a[i] = 6;
			else if (f[i].equals("violet"))
				a[i] = 7;
			else if (f[i].equals("grey"))
				a[i] = 8;
			else if (f[i].equals("white"))
				a[i] = 9;
		}
		f1 = in.nextLine();
		if (f1.equals("black"))
			ze = 1;
		else if (f1.equals("brown"))
			ze = 10;
		else if (f1.equals("red"))
			ze = 100;
		else if (f1.equals("orange"))
			ze = 1000;
		else if (f1.equals("yellow"))
			ze = 10000;
		else if (f1.equals("green"))
			ze = 100000;
		else if (f1.equals("blue"))
			ze = 1000000;
		else if (f1.equals("violet"))
			ze = 10000000;
		else if (f1.equals("grey"))
			ze = 100000000;
		else if (f1.equals("white"))
			ze = 1000000000;
		long abc;
		abc = (a[0] * 10) + a[1];
		long register = abc * ze;
		System.out.println(register);
	}
}