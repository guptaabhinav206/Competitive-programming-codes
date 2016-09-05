#include<stdio.h>
 
 
/*int checkPre(char ch)
  {
  if(ch
  }*/
 
int main()
{
	char str[500];
	int n;
	scanf("%d",&n);
	int i;
	for(i=0;i<n;i++)
	{
		scanf("%s",str);
		int j=0,k=0;
		while(str[k]!='\0')
		{
			switch(str[k])
			{
				case '(':
					str[j]='(';
					j++;
					break;
				case ')':
					while(str[j-1]!='(')
					{
						printf("%c",str[j-1]);
						j--;
					}
					j--;
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '^':
					//checkpre(str[i]);
					if(str[k]=='*')
						str[k]+=4;
					while(str[j-1]!='(')
					{
						if(str[j-1]-str[k]>=0)
						{
							printf("%c",str[j-1]);
							j--;
						}
						else
							break;
					}
					str[j]=str[k];
					if(str[k]=='*'+4)
						str[j]='*';
					j++;
					break;
				default:
					printf("%c",str[k]);
					break;
			}
			k++;
		}
		while(j-1>=0)
		{
			printf("%c",str[j-1]);
			j--;
		}
		printf("\n");
	}
	return 0;
} 
