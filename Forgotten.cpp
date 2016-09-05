#include<stdio.h>
#include <cstdio>
#include <map>
#include <string>
#include <cstring>
#include <bits/stdc++.h>
 
char inp[103][103];
char giv[3000][3000];
char ans[101][4];
 
int main()
{
    long long int t,n,k;
    long long int i,j,l,z,temp;
	scanf("%lld",&t);
 
	while(t--){
		l = temp = 0;
		scanf("%lld%lld",&n,&k);
 
		for(i=0;i<n;i++){
			scanf("%s",inp[i]);
		}
 
		for(i=0;i<k;i++){
			scanf("%lld",&z);
			for(j = temp;j<z+temp;j++){
			  scanf("%s",giv[j]);
			  }
			temp = temp + z;
		}
		for(j=0;j<n;j++){
		  for(i=0;i<temp;i++){
 
			if(strcmp(inp[j],giv[i]) == 0){
			   strcpy(ans[l],"YES");
			   break;
            }
			else
			{
			   strcpy(ans[l],"NO");
            }
 
		 }
		 l++;
	}
	for(i=0;i<n;i++)
		printf("%s ",ans[i]);
		   printf("\n");
	}
	return 0;
}
