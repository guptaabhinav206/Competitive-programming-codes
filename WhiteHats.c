#include<stdio.h>
 
int arr[1010]={0};
 
int main()
{
    int n,i,flag = 0,temp;
 
    scanf("%i",&n);
 
    for(i=1;    i<=n;   i++)
    {
        scanf("%i",&temp);
        arr[temp]++;
    }
 
    for(i=n-1;  i>=0;   i--)
        if(arr[i])
            flag++;
 
    if(arr[n-1] == n)
        printf("%i\n",n);
 
    else if(arr[0] == n)
        printf("0\n");
 
    else if(flag!=2)
        printf("-1\n");
 
    else
    {
        for(i=n-1;  i>=0;   i--)
            if(arr[i])
                break;
 
        if(arr[i-1] && arr[i]+i == n &&  arr[i-1] == i)
            printf("%i\n",arr[i-1]);
        else
            printf("-1\n");
    }
 
    return 0;
} 
