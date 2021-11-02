#include<stdio.h>

void	ft_strrev(char *s,int f, int l)
{
	while (f <= l)
	{
		printf("%c",s[l]);
		l--;
	}
}

int	main(void)
{
	int		i;
	int		j;
	int		k;
	char	str[1001];
	scanf("%d",&k);
	while (k--)
	{
		i = 0;
		j = 0;
		getchar();
		scanf("%[^\n]s",str);
		while (str[i])
		{
			if (str[i] == ' ')
			{
				ft_strrev(str, j, i - 1);
				printf(" ");
				j = i + 1;
			}
			i++;
		}
		ft_strrev(str, j, i - 1);
		i = 0;
		while (str[i])
		{
			str[i] ='\0';
			i++;
		}
		printf("\n");
	}
}