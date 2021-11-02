import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int k = sn.nextInt();
		Integer[] munseoTest;
		for (int z = 0 ; z < k ; z++){
			int n = sn.nextInt();				//문서 수
			int m = sn.nextInt();				//문서 위치
			Integer []munseo = new Integer [n];
			munseoTest = new Integer[n];
			for (int i = 0 ; i < n ; i++){
				munseo[i] = sn.nextInt();	//중요도
				munseoTest[i] = munseo[i];
			}
			Arrays.sort(munseoTest, Collections.reverseOrder());
			for (int i = 0 ; i < n - 1; i++){
				int j = i + 1;
				while(true)
				{
					if (j < n)
					{
						if (munseo[i] < munseo[j])			//4 3 1 2
						{
							munseo = sortsort(munseo, i, n);
							if (i == m)
								m = n - 1;
							else if (m > i)
								m -= 1;
							j = 0;
							System.out.println(i + " : " + m);
						}
					}
					j++;
					if (munseo[i] == munseoTest[i]){
						break;
					}
				}
				System.out.println(i + " : " + m);
			}
			System.out.println((m + 1));
		}
	}

	private static Integer[] sortsort(Integer []munsu, int a, int n) {
		int temp = munsu[a];
		for (int i = a; i < n - 1 ; i ++){			
			munsu[i] = munsu[i + 1]; 
		}
		munsu[n - 1] = temp;
		return munsu;
	}
}