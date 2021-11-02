import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int	[] exer = new int [5];
		for (int i = 0 ; i < 5 ; i++){
			exer[i] = scan.nextInt();
		}
		// 운동시간, 초기맥박, 최대맥박, 맥박 증가량, 맥박 감소량
		int mac = exer[2] - exer[1]; //0 50
		int max_mac = mac; //50
		int i = 0;
		int time = 0;
		if (mac < exer[3])
		{
			System.out.println("-1");
			System.exit(0);
		}
		while (i < exer[0]){
			if (mac - exer[3] >= 0)
			{
				mac -= exer[3];
				i++;
			}
			else if(mac - exer[3] < 0)
			{
				mac += exer[4];
				if (mac > max_mac)
					mac = max_mac;
			}
			time++;
		}
		System.out.println(time);
	}
}