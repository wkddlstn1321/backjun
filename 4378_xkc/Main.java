import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String key ="`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
		String input;
		while (sn.hasNextLine())
		{
			input = sn.nextLine();
			for (int i = 0 ; i < input.length() ; i++){
				if (input.charAt(i) == ' ')
					System.out.print(" ");
				else
				{
					for (int j = 0; j < 50 ; j++){
						if (input.charAt(i) == key.charAt(j))
						{
							System.out.print(key.charAt(j - 1));
							break;
						}
					}
				}
			}
			System.out.println();
		}
	}
}