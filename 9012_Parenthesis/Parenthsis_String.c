#include<stdio.h>

int	yes_or_no(char *s)
{
	int	i;

	i = 0;
	while (s[i])
	{
		if (s[i] != 'o')
		{
			printf("NO\n");
			return (0);
		}
		i++;
	}
	return (1);
}

int	main(void)
{
	int		k;
	int		i;
	int		j;
	int		ci = 0;
	char	c[10000][50];
	scanf("%d",&k);
	while (k--)
	{
		i = 0;
		scanf("%s",c[ci]);
		while (c[ci][i])
		{
			j = i + 1;
			while (c[ci][i] == '(' && c[ci][j])
			{
				if (c[ci][j] == ')')
				{
					c[ci][j] = 'o';
					c[ci][i] = 'o';   //oooo
					break;
				}
				j++;
			}
			i++;
		}
		if (yes_or_no(c[ci]))
			printf("YES\n");
		ci++;
	}
}