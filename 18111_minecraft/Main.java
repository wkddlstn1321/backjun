import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int g = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int time = Integer.MAX_VALUE;
		int max = 0;
		int min = Integer.MAX_VALUE;
		int [][]deep = new int[s][g];
		int [][]rand = new int[s][g];
		for (int i = 0 ; i < s ; i++){
			st = new StringTokenizer(br.readLine());
			for (int j = 0 ; j < g ; j++){
				deep[i][j] = Integer.parseInt(st.nextToken());
				if (max < deep[i][j])
				{
					max = deep[i][j];
				}
				if (min > deep[i][j])
				{
					min = deep[i][j];
				}
			}
		}
		int save = max;
		for (int i = max ; i >= min ; i--){
			for (int [] a : rand){
				Arrays.fill(a, i);
			}
			int time2 = calcul(deep,rand,s,g,b,time);
			if (time > time2)
			{
				time = time2;
				save = i;
			}
			if (time )
		}
		System.out.println(time + " " + save);
	}

	private static int calcul(int [][]d, int[][]r, int s, int g, int b, int t) {
		int time = 0;
		for (int i = 0 ; i < s ; i++){
			for (int j = 0 ; j < g ; j++){
				if (d[i][j] > r[i][j])		//벽돌 제거
				{
					int diff = d[i][j] - r[i][j];
					b += diff;
					time += diff * 2;
				}
				else if (d[i][j] < r[i][j])	//벽돌 추가
				{
					int diff = r[i][j] - d[i][j];
					b -= diff;
					time += diff;
				}
			}
			if (time > t)
				return Integer.MAX_VALUE;
		}
		if (b < 0)
			return Integer.MAX_VALUE;
		return time;
	}
}