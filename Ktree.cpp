#include <iostream>
using namespace std;
int mod = 1000000007;
int main() {
    // your code goes here
    int n,k,d;
    cin >> n >> k >> d;
    if(d>k)
    {
        cout << 0 ;
        return 0;
    }
    long long a[n][n+1][2];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n+1;j++)
            for(int k=0;k<2;k++)
                a[i][j][k] = 0;
    }
    for(int i=1;i<=min(k,n);i++)
    {
        if(i<d)
            a[0][i][0] = 1;
        else
            a[0][i][1] = 1;
    }
    for(int i=1;i<n;i++)
    {
        for(int j=0;j<n+1;j++)
        {
            for(int r=1;r<=min(k,j);r++)
            {
                if(r<d)
                    {
                        a[i][j][0] = (a[i][j][0] + a[i-1][j-r][0])%mod;
                        a[i][j][1] = (a[i][j][1] + a[i-1][j-r][1])%mod;
                    }
                else
                    {
                        a[i][j][1] = (a[i][j][1] + a[i-1][j-r][0] + a[i-1][j-r][1])%mod;
                    }
            }
        }
    }
    long long ans = 0;
    for(int i=0;i<n;i++)
    {
        ans = (ans+a[i][n][1])%mod;
    //  cout << a[i][n][1] << endl;
    }
    cout << ans;
    return 0;
}
