import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		List<Integer> a = new ArrayList<>();
		int []left = new int[n];
		for (int i = 0 ; i < n ; i++){
			left[i] = sn.nextInt();
		}
		for (int i = n - 1 ; i >= 0 ; i--){
			a.add(left[i], i + 1);
		}
		for (int answer : a){
			System.out.print(answer + " ");
		}
	}
}
//2 1 1 0
//1 2 3 4
//0 1 2 3
//a.add(0,4)
//a.add(1,3)
//a.add(1,2)
//a.add(2,1)
//a = [4, 2 ,1 ,3]
