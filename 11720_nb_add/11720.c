#include<stdio.h>

int	main(void)
{
	int	size;
	int	i = 0;
	int	sum = 0;

	scanf("%d",&size);
	char	c[size];
	scanf("%s",c);
	while (i < size)
	{
		sum += c[i] - 48;
		i++;
	}
	printf("%d",sum);
}