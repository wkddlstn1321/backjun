import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();			//랭킹 리스트
		int s = sn.nextInt();			//현재 점수
		int p = sn.nextInt();			//랭킹 리스트 한도 
		int []rank = new int [p];
		int sunwi = 0;
		if (n > 0)  
		{
			for(int i = 0 ; i < n ; i++){
				rank[i] = sn.nextInt();
			}
		}
		if (n == p)  //리스트가 full 일때
		{
			if (s <= rank[n - 1]){
				System.out.println(-1);
				System.exit(0);
			}
		}
		for (int i = 0; i < p ; i++){
			if (rank[i] <= s)				//현재점수가 리스트 보다 높을 때
			{
				sunwi = i + 1;
				System.out.println(sunwi);
				System.exit(0);
				break ;
			}
		}
		System.out.println(-1);
	}
}