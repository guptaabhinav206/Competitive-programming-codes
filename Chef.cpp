#include<iostream>
#include<cstdio>
#include<algorithm>
 
using namespace std;
int main()
{
	int x1,x2,x3,x4,y1,y2,y3,y4;
	int arr1[4],arr2[4];
	int temp1,temp2;
    int area;
	int t;
	cin>>t;
	while(t--)
	{
        area=0;
		cin>>x1>>y1>>x2>>y2;
		cin>>x3>>y3>>x4>>y4;
		arr1[0]=x1;
		arr1[1]=x2;
		arr1[2]=x3;
		arr1[3]=x4;
		arr2[0]=y1;
		arr2[1]=y2;
		arr2[2]=y3;
		arr2[3]=y4;
		temp1=(x2-x1)*(y2-y1);
		temp2=(x3-x4)*(y3-y4);
		sort(arr1,arr1+4);
		sort(arr2,arr2+4);
		if(temp1<0)
		        {  
                 temp1*=-1;
                 }
		if(temp2<0)
		           {
		            temp2*=-1;
                    }
		if(x3<x1&&y3<y1&&x4>x2&&y4>y2)
		                              cout<<temp2<<endl;
		else if(x3>x1&&y3>y1&&x4<x2&&y4<y2)
		                                    cout<<temp1<<endl;
		else if(x3>=x2||x4<=x1||y3>=y2||y4<=y1)
		                                       cout<<temp1+temp2<<endl;
		else
		{
			 area=(arr1[1]-arr1[2])*(arr2[1]-arr2[2]);
			 if(area<0)
			 area*=-1;
			cout<<temp1+temp2-area<<endl;
		}
	}
	return 0;
} 
 
