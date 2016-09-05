#include<stdio.h>
#include<math.h>
int main()
{
  int tc;
 	int num,num_of_input=2;
	while(1)
	{
		int x=-1,y=-1;
		char ch;
		scanf("%d",&num);
		scanf("%c",&ch);
		if(ch=='\n')
			num_of_input=1;
		else
		{	
			scanf("%d",&y);
			num_of_input=2;
		}
		x=num;
		if(x==0 && y==0)
			break;
		if(num_of_input==1)
		{
		if((num-1)%23==(num-1)%46)
		printf("%d, %d\n",23*(num/46)+2,23*(num/46)+(num-1)%23 +1);
		else
		printf("%d, %d\n",23*((num-1)/46)+(num-1)%23+2,23*((num-1)/46)+24);
		}
		else
		{
			if((x-2)%23==0 && (x-2)<y && y<(x-2)+24)
			{
					printf("%d\n",(((x-2)/23)*46)+1+((y-1)%23));
			}
			else
			{
				if((y-1)%23==0 && x>y-23 && x<(y+1))
				{
					printf("%d\n",(((y-1)/23)*46-(23))+1+((x-2)%23));
				}
				else
				{
					printf("No Number\n");
				}
			}
		}
	}
	return 0;
 
}
