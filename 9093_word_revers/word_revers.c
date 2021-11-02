#include<stdio.h>
#include<string.h>

void	ft_strrev(char *s)
{
	int	i = 0;
	int	len = strlen(s);
	int temp;

	while (i < len / 2)
	{
		temp = s[i];
		s[i] = s[len - 1 - i];
		s[len - 1 - i] = temp;
		i++;
	}
	printf("%s ",s);
}

int	main(void)
{
	int		i;
	int		j;
	int		k;
	int 	index;
	int		wcnt = 1;
	char	str[1000];
	char	str2[20][1000];
	scanf("%d",&k);
	while (k--)
	{
		i = 0;
		j = 0;
		index = 0;
		getchar();
		scanf("%[^\n]s",str);
		while (str[index])
		{
			if (str[index] == ' ')
			{
				str2[i][j+1] = '\0';
				i++;
				j = 0;
				index++;
				wcnt++;
			}
			str2[i][j] = str[index];
			j++;
			index++;
		}
		i = 0;
		while (i < wcnt)
		{
			ft_strrev(str2[i]);
			i++;
		}
		i = 0;
		while (i < wcnt)
		{
			j = 0;
			while (str2[i][j])
			{
				str2[i][j] = '\0';
				j++;
			}
			i++;
		}
		i = 0;
		printf("\n");
	}
}