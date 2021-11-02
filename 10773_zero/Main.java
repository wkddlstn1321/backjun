import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int k = sn.nextInt();
		Stack<Integer> st = new Stack<>();
		int a = 0;
		for (int i = 0 ; i < k ; i++){
			a = sn.nextInt();
			if (a == 0)
				st.pop();
			else
				st.push(a);
		}
		int sum = 0;
		for (Integer w : st){
			sum += w;
		}
		System.out.println(sum);
	}
}