#include <iostream>
#include<vector>
using namespace std;
int main(){
int n, v, svar=0, a, b;
cin>>n>>v;
vector<int> c(3010);
for(int i=0;i<n;i++){
cin>>a>>b;
c[a+1]+=b;
}
for(int i=1;i<3010;i++){
int p=c[i-1];
if(p>v){
svar+=v;
continue;
}
int o=c[i];
c[i]-=v-p;
if(c[i]<0) c[i]=0;
p+=o;
if(p>v){
svar+=v;
continue;
}
svar+=p;


}
cout<<svar<<endl;
}
