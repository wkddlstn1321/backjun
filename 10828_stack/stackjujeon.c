#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void	push(int *stack_index, int *stack)
{
	int	digit;

	scanf("%d", &digit);
	stack[*stack_index] = digit;
	*stack_index += 1;
}

void	pop(int *stack_index, int *stack)
{
	if (*stack_index != -1) // -1 : empty
	{
		printf("%d", stack[*stack_index]);
		stack[*stack_index] = -1;
		*stack_index -= 1;
	}
	else
		printf("-1");
}

void	ft_size(int stack_index)
{
	printf("%d", stack_index);
}

void	empty(int stack_index)
{
	if (stack_index == 0)
		printf("1\n");
	else
		printf("0\n");
}

void	top(int stack_index, int *stack)
{
	 printf("%d", stack[stack_index]);
}

void	 processing_stack(int size, int *stack)
{
	int		i;
	int		stack_index;
	char	order[BUFSIZ];
	int		digit;

	i = 0;
	stack_index = 0;
	while(i < size)
	{
		scanf("%s", order);
		if (strcmp(order, "push") == 0)
			push(&stack_index, stack);
		else if (strcmp(order, "pop") == 0)
			pop(&stack_index, stack);
		else if (strcmp(order, "size") == 0)
			ft_size(stack_index);
		else if (strcmp(order, "empty") == 0)
			empty(stack_index);
		else if (strcmp(order, "top") == 0)
			top(stack_index, stack);
		i++;
	}
}

void	initial_stack(int size, int *stack)
{
	int	i;

	i = 0;
	while (i < size)
	{
		stack[i] = -1;
		i++;
	}
}

int	main()
{
	int	size;
	int	*stack;

	scanf("%d", &size);
	stack = malloc(sizeof(int) * size);
	initial_stack(size, stack);
	processing_stack(size, stack);
	free(stack);
}
