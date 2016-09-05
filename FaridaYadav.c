#include<stdio.h>
#include<math.h>
int main(){
	int t;
	scanf("%d",&t);
	double a,b;
	while(t--){
		scanf("%lf %lf",&a,&b);
		printf("%.3lf\n",2*sqrt(a*a-b*b));
	}
	return 0;
} 
