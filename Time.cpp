
    #include <iostream>
    #include <iomanip>
    #include <cmath>
    #include <vector>
    #include <string>
    using namespace std;
 
    int main() {
 
    	int t;
    	float hour[12],minute[61];
 
    	float error=1.0/120;
    	float res;
 
    	for(int i=0;i<12;i++)
{
    hour[i]=i*30;
}
    	for(int i=0;i<60;i++){
    		minute[i]=i*6;
    	}
    	cin>>t;
    	while(t--){
 
    		float temp;
    		cin>>temp;
 
    		for(int i=0;i<12;i++){
 
    			for(int j=0;j<60;j++){
 
    				res=fabs(minute[j]-(hour[i]+j/2.0));
 
    				if(res>=180){
    					res=360-res;
    				}
    				if(fabs(res-temp)<=error){
    					cout<<setfill('0')<<setw(2)<<i;
    					cout<<":";
    					cout<<setfill('0')<<setw(2)<<j<<"\n";
    				}
    			}
    	}
    }
 
    	return 0;
    }
