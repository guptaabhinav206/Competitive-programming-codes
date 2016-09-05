#include<stdio.h>
int main()
{
int t,q,count,sum,target,i;
scanf("%d",&t);
int arr[t];
for(i=0;i<t;i++)
    scanf("%d",&arr[i]);
scanf("%d",&q);
while(q--)
{
    scanf("%d",&target);
    count=1;
    sum=arr[0];
 
    for(i=1;i<t;i++)
    {
 
        if(sum<target)
        {
            count++;
            sum+=arr[i];
        }
 
        else break;
    }
    if(sum<target)
        printf("-1\n");
    else     printf("%d\n",count);
 
}
 
return 0;
}
