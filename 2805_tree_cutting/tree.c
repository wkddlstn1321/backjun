#include<stdio.h>

int	main(void)
{
	int	n;
	int	m;
	int tree[1000001];
	int save;
	int	min = 0;
	int	max = 0;
	long long	mid;

	scanf("%d%d",&n,&m);
	for (int i = 0 ; i < n ; i++)
	{
		scanf("%d",&tree[i]);
		if (tree[i] > max)
			max = tree[i];
	}
	long long sum;
	while (min <= max)
	{
		sum = 0;
		mid = (min + max) / 2;
		for (int i = 0 ; i < n ; i++)
		{
			if (tree[i] - mid > 0)
				sum += tree[i] - mid;
		}
		if (sum >= m)
		{
			min = mid + 1;
			if (save < mid)
				save = mid;
		}
		else if (sum < m)
			max = mid - 1;
		else
		{
			min = mid;
			break ;
		}
	}
	printf("%d",save);
	return (0);
}
