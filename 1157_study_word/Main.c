#include<stdio.h>

int	main()
{
	int n;
	scanf("%d", &n);
	float ary[n];
	float max = 0;
	for(int i = 0; i < n ; i++){
		float in;
		ary[i] = scanf("%f",&in);
		if (max < in)
			max = in;
	}
	float f = 0;
	for (int i = 0 ; i < n ; i++){
		if (max != ary[i])
		{
			f = ((ary[i] / max) * 100) + f;
		}
	}
	printf("%f",f / 3);
}