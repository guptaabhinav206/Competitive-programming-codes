#include <iostream>
#include <string>
#include <cmath>
#include <cstdio>
#include <vector>
 
using namespace std;
 
long long arr[1000005]={};
 
int main()
{
	int t;
    scanf("%d",&t);
	while(t--)
	{
		long long n, h;
		long long i, j, x, y, sum=0, num;
		long long temp1,temp2;
		cin>>n>>h;
		for(i=0; i<n; i++)
		{
		    arr[i]=0;
		}
		for(i=0; i<n; i++)
		{
			cin>>x>>y;
			arr[x]++;
			arr[y+1]--;
		}
		for(i=1; i<n; i++)
		{
			arr[i]+=arr[i-1];
		}
		for(i=0; i<h; i++)
		{
			sum+=arr[i];
		}
		num=sum;
		for(i=h; i<n; i++)
		{
			sum+=arr[i];sum-=arr[i-h];
			if(num<sum)
			{
			    num=sum;
			}
		}
		// Print the output
		cout<<n*h-num<<endl;
	}
	return 0;
}
 
