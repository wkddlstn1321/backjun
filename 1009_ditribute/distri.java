import java.util.Scanner;

public class distri{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		for (int i = 0 ; i < k; i++){
			int a = in.nextInt();
			int b = in.nextInt();
			int data = 1;
			for (int j = 0 ; j < b; j++){
			data = (data * a) % 10;
			}
			if(data == 0){
				data = 10;
			}
			System.out.println(data);
		}
	}
}