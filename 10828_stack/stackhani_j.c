#include <stdio.h>
#include <string.h>

int   main(void)
{
   int	cmdnum = 0;
   int	i = 0;
   int	num = 0;
   int   arr[10000];
   int   count = 0;
   char cmd[BUFSIZ];

   scanf("%d", &cmdnum);
   while (i < cmdnum)
   {
      scanf("%s", cmd);
      if (strcmp(cmd, "push") == 0)
      {
         scanf("%d", &num);
         arr[count] = num;
         count++;
      }
      if (strcmp(cmd, "pop") == 0)
      {
         if (count == 0)
            printf("-1\n");
         else
         {
         printf("%d\n", arr[count - 1]);
         arr[count - 1] = 0;
         count--;
         }
      }
      if (strcmp(cmd, "size") == 0)
      {
         printf("%d\n", count);
      }
      if (strcmp(cmd, "empty") == 0)
      {
         if (count == 0)
            printf("1\n");
         else
            printf("0\n");
      }
      if (strcmp(cmd, "top") == 0)
      {
         if (count == 0)
            printf("-1\n");
         else
            printf("%d\n", arr[count - 1]);
      }
      i++;
   }
   return 0;
}