#include<stdio.h>
int main(){
 
	int t;
	scanf("%d",&t);
	while(t--){
		long long int n;
		scanf("%lld",&n);
		long long int A[n],i,j,sub[n];
 
		for(i=0;i<n;i++){
			scanf("%lld",&A[i]);
			sub[i] = 1;
		}
 
		for(i=0;i<n-1;i++){
			if(A[i+1]>=A[i]){
				sub[i+1] = sub[i] + 1;
			}
		}
		long long int ans = 0;
		for(i=0;i<n;i++){
			ans +=sub[i];
		}
 
		printf("%lld\n",ans);
	}
	return 0;
}
 
