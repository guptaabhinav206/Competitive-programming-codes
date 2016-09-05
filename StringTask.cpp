#include <cstdio>
#include <cstring>
#include <algorithm>
using namespace std;

int main()
{
    char s[105];
    while(~scanf("%s", s))
    {
        for(int i=0;s[i];++i)
        {
            if(s[i] >= 'A' && s[i] <= 'Z')
            {
                s[i] = s[i] - 'A' + 'a';
            }
        }
        for(int i=0;s[i];++i)
        {
            if(s[i] == 'a' || s[i] == 'o' || s[i] == 'y' ||
               s[i] == 'e' || s[i] == 'u' || s[i] == 'i')
            {
                continue;
            }
            else
            {
                printf(".%c", s[i]);
            }
        }
        printf("\n");
    }
    return 0;
}
