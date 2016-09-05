#include<stdio.h>
#include<string.h>
int arr[26];
 
int main()
{
    char a[10000];
    long long int n,val=0,k,max=0,i=0;
    scanf("%s",a);
    n=strlen(a);
    scanf("%lld",&k);
    for(i=0;i<26;i++)
    {
        scanf("%d",&arr[i]);
        if(arr[i]>max)
            max=arr[i];
    }
    i=0;
    for(i=0;i<n;i++)
    {
        int p;
         p=a[i];
//printf("%d",p);
         p=p-97;
        val=val+(i+1)*arr[p];
    }
  while(k!=0)
  {
   val=val+(i+1)*max;

   i++;
   k--;
  }
 
  printf("%lld",val);
return 0;
}
