#include <stdio.h>
 
int main(void) {
    int n;
    scanf("%d", &n);
    int i;
    int a[n];
    for(i = 0; i < n; ++i) {
        scanf("%d", &a[i]);
    }
    int count1 = 0, count2 = 0;
 
    for (i = 0; i< n; ++i) {
        if (a[i] == 100) {
            count1++;
        } else {
            count2++;
        }
    }
    //printf("%d %d", count1, count2);
    if ((count1&1) == 1 && (count2&1) == 1) {
        printf("NO");
    } else if ((count2&1) == 0 && (count1&1) == 1) {
            printf("NO");
    } else if ((count2&1) == 1 && (count1 == 0)) {
        printf("NO");
    } else if ((count2&1) == 1 && ((count1&1) == 0)) {
        printf("YES");
    } else if ((count2&1) == 0 && (count1&1) == 0) {
        printf("YES");
    }
    return 0;
}
 
