#include<stdio.h>
#define max(a,b) (a)>(b)?(a):(b)
#define min_(a,b) (a)<(b)?(a):(b)
int hasht[100002],hashb[100002],hashc[100002];
int main()
{
	int n,i,a,b,min,m;
	scanf("%lld",&n);
	for(i=1;i<=n;i++)
	{
		scanf("%d%d",&a,&b);
		hasht[a]++;
		if(a!=b)hashb[b]++;
	}
	m=(n+1)/2;
	min=999999;
	for(i=0;i<100001;i++)
	{
		int c1=hasht[i];
		int c2=hashb[i];
		if ( c1+c2<m )
			continue;
		min=min_(min,max(m-c1,0));
	}
 
	if(min==999999)
		printf("Impossible\n");
	else
		printf("%d\n",min);
	return 0;
} 

