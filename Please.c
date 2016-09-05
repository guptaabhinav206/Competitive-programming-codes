#include<stdio.h>
#include<stdlib.h>
#include<string.h>
inline unsigned long long f_inp() {
    char c;
    unsigned long long n = 0;
    while(c=getchar_unlocked()) {
        if(c=='\n' || c==' ')
            break;
        n=n*10+c-48;
    }
return n;
}
 
int main ( ) {
    int t,flag;
    int i;
    unsigned long long l,d,c,s,sum;
    t=f_inp();
    while(t--){
        scanf("%llu%llu%llu%llu",&l,&d,&s,&c);
        sum=s;
        if(sum>=l) 
        flag=1;
        else 
        flag=0;
        for(i=1;i<d;i++)
        {
            sum*=(c+1);
            if(sum>=l) 
            {
                flag=1;
                break;
 
            }
        }
        if(!flag) 
        printf("DEAD AND ROTTING\n");
        else 
        printf("ALIVE AND KICKING\n");
    }
return 0;
} 
