#include<stdio.h>
int main()
{
    int t;
    scanf("%d",&t);
 
    while(t--)
    {
        int n;
        scanf("%d",&n);
 
        long int w[n+1];
        char s1[n];
        char s2[n];
 
        int count=0;
        int i;
 
        scanf("%s\n%s",s1,s2);
 
        for(i=0;i<n;i++)
        {
            if(s1[i]==s2[i])
                count++;
        }
        for(i=0;i<n+1;i++)
        {
            scanf("%ld",&w[i]);
        }
 
        if(count==n){
            printf("%ld\n",w[n]);
        }
 
        else{
 
            int j=0;
 
            for(i=1;i<=count;i++)
            {
                if(w[i]>w[j])
                    j=i;
                    //printf();
                    // i=j;
            }
 
            printf("%ld\n",w[j]);
        }
    }
    return 0;
}
 
