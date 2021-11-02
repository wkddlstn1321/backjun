#include<stdio.h>
#include<string.h>

int	main(void)
{
	int		a;
	int		data;
	int		i = 0;
	int		stack[10000];
	int		num = -1;
	char	cmd[10000][5];

	scanf("%d",&a);
	while (a--)
	{
		scanf("%s",cmd[i]);
		if (strcmp(cmd[i],"push") == 0)
		{
			scanf("%d",&data);
			num += 1;
			stack[num] = data;
		}
		else if (strcmp(cmd[i],"pop") == 0)
		{
			if (num == -1)
				printf("%d\n",num);
			else
			{
				printf("%d\n",stack[num]);
				num -= 1;
			}
		}
		else if (strcmp(cmd[i],"size") == 0)
			printf("%d\n",num + 1);
		else if (strcmp(cmd[i],"empty") == 0)
		{
			if (num == -1)
				printf("1\n");
			else
				printf("0\n");
		}
		else if (strcmp(cmd[i],"top") == 0)
		{
			if (num == -1)
				printf("-1\n");
			else
				printf("%d\n",stack[num]);
		}
		i++;
	}
}