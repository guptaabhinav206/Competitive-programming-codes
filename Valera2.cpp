#include<iostream>
#include<vector>
using namespace std;
int main()
{
    // Intialising variables

    vector<int> v;
    int n, k;
    cin>>n>>k;
    for(int i=1;i<=n;i++)
        {
            int p;
            cin>>p;
            int w;
            int l=0;    // input
             for(int j=1;j<=p;j++)
                {
                    cin>>w;
                    if(w<k&&l<1)
                        {v.push_back(i);l++;}
                }
        }
    int b=v.size();
   // Output
   
    cout<<b<<endl;
    if(b!=0)
    {
        for(int i=0;i<v.size();i++)
        {
            cout<<v[i]<<" ";
        }
    }
    return 0;
}
