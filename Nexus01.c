#include<stdio.h>
int main(){
 
long long int t,n,i,max;
scanf("%lld",&t);
while(t--){
scanf("%lld",&n);
max=0;
long long int sum=0;
long long int arr[n];
for(i=0;i<n;i++){
scanf("%lld",&arr[i]);
sum+=arr[i];
if(max<=arr[i]){max=arr[i];}
}
long long int req=n*max;
 
printf("%lld\n",req-sum);
}
return 0;
}
