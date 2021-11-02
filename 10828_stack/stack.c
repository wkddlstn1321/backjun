#include<stdio.h>
#include<string.h>

int	main(void)
{
	int		a;
	int		data;
	int		stack[10000];
	int		num = -1;
	char	command[BUFSIZ];

	scanf("%d",&a);
	while (a--)
	{
		scanf("%s",command);
		if (strcmp(command,"push") == 0)
		{
			scanf("%d",&data);
			num += 1;
			stack[num] = data;
		}
		else if (strcmp(command,"pop") == 0)
		{
			if (num == -1)
				printf("%d\n",num);
			else
			{
				printf("%d\n",stack[num]);
				num -= 1;
			}
		}
		else if (strcmp(command,"size") == 0)
			printf("%d\n",num + 1);
		else if (strcmp(command,"empty") == 0)
		{
			if (num == -1)
				printf("1\n");
			else
				printf("0\n");
		}
		else if (strcmp(command,"top") == 0)
		{
			if (num == -1)
				printf("-1\n");
			else
				printf("%d\n",stack[num]);
		}
	}
}