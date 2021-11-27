public class Main{
	public static void main(String[] args) {
		// int []self_number = new int[10000];
		// for (int i = 1 ; i <= 9987 ; i++){
		// 	int d = 0;
		// 	int j = i;
		// 	while (d <= 10000)
		// 	{
		// 		self_number[d] = 1;
		// 		d = cren(j);
		// 		j++;
		// 	}
		// }
		System.out.println(cren(10));
	}

	private static int cren(int j) {
		int sum = 0;
		int cnt = 1;
		int num = j;
		while (num >= 10)
		{
			cnt *= 10;
			num /= cnt;
		}
		while (cnt > 0)
		{
			sum += j / cnt;
			cnt /= 10;
		}
		return sum;
	}
}