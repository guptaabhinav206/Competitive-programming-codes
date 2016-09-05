#include<stdio.h>
static int a[1000000];
int main(){
  int ns=0,i;
  for(i=1;i<1000000;i++){
    if((a[i])==0)printf("%d\n",i);
    ns=i+(i%10)+(i/10)%10+(i/100)%10+(i/1000)%10+(i/10000)%10+(i/100000)%10;
    a[ns]=1;
  }
  return 0;
} 
