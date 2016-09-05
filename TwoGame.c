#include<stdio.h>
 
int main()
{
    long long a,b,temp;  int t;
 
    scanf("%i",&t);
 
    while(t--)
    {
        scanf("%lld%lld",&a,&b);
 
        if(a<b)
            b = a+b - (a=b);
 
        while(b)
        {
            temp = a;
            a = b;
            b = temp % b;
        }
 
        while(a%2==0)
            a /= 2;
 
        if(a==1)
            printf("Y\n");
        else
            printf("N\n");
    }
    return 0;
}
