#include<stdio.h>
#include<math.h>
int main() 
{
int tc=0,i;
while(1){
double P,I;
int C;
scanf("%lf%lf%d", &P,&I,&C);
if(C==0)break;
 
double res=P;
for(i=0;i<C;i++)
{
double x=floor(res*I/C);
res+=x/100;
}
 
printf("Case %d. $%.2f at %.2f%% APR compounded %d times yields $%.2f\n", ++tc,P,I,C,res);
}
 
return 0;
} 
